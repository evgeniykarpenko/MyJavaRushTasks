package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class Server {

    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<String, Connection>();

    public static void main(String[] args) throws IOException {

        int serverPort = ConsoleHelper.readInt();
        ServerSocket serverSocket = new ServerSocket(serverPort);
        ConsoleHelper.writeMessage("Server start!");
        try {
            while (!serverSocket.isClosed()) {
                Socket socket = serverSocket.accept();
                OutputStream outputStream = socket.getOutputStream();
                InputStream inputStream = socket.getInputStream();
                Handler handler = new Handler(socket);
                handler.start();
            }
        } catch (IOException e) {
            serverSocket.close();
        }

    }

    public static void sendBroadcastMessage(Message message) {
        try {
            for (Map.Entry<String, Connection> conn : connectionMap.entrySet()
                    ) {
                conn.getValue().send(message);
            }
        } catch (IOException e) {
            ConsoleHelper.writeMessage("Error to send message");
        }
    }

    private static class Handler extends Thread {
        Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {
            Message mes;
            String name ;
            do {
                connection.send(new Message(MessageType.NAME_REQUEST));
                mes = connection.receive();
                name = mes.getData();

            }
            while (mes.getType() != MessageType.USER_NAME || name.isEmpty() || connectionMap.containsKey(name));
            connection.send(new Message(MessageType.NAME_ACCEPTED));
            connectionMap.put(name, connection);
            return name;
        }

        private void sendListOfUsers(Connection connection, String userName) throws IOException
        {
            for (Map.Entry<String, Connection> conn : connectionMap.entrySet()
                    ) {
               if(conn.getKey()!=userName)
                connection.send(new Message(MessageType.USER_ADDED,conn.getKey()));

            }
        }

        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException
        {
            Message mes;

            do{
                mes = connection.receive();


                if(mes.getType()==MessageType.TEXT)
                    sendBroadcastMessage(new Message(MessageType.TEXT, userName + ": " + mes.getData()));
                else ConsoleHelper.writeMessage("Error!");
            }
            while (true);

        }

        public void run()

        {
            ConsoleHelper.writeMessage(socket.getRemoteSocketAddress().toString());
            try {
                Connection connection = new Connection(socket);
                String userName = serverHandshake(connection);
                sendBroadcastMessage(new Message(MessageType.USER_ADDED, userName));
                sendListOfUsers(connection,userName);
                serverMainLoop(connection,userName);
                connectionMap.remove(userName);
                sendBroadcastMessage(new Message(MessageType.USER_REMOVED, userName));
                connection.close();
            } catch (IOException e) {
                ConsoleHelper.writeMessage("Error1!");
            } catch (ClassNotFoundException e) {
                ConsoleHelper.writeMessage("Error1!");
            }
            ConsoleHelper.writeMessage("Connection close...");
        }
    }
}
