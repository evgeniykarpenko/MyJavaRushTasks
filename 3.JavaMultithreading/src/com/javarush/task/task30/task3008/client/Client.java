package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.Connection;
import com.javarush.task.task30.task3008.ConsoleHelper;
import com.javarush.task.task30.task3008.Message;
import com.javarush.task.task30.task3008.MessageType;

import java.io.IOException;
import java.net.Socket;

public class Client {

    protected Connection connection;
    private volatile boolean clientConnected = false;

    public static void main(String[] args) {
        Client client = new Client();
        client.run();
    }
    public class SocketThread extends Thread
    {
        protected void processIncomingMessage(String message)
        {
            ConsoleHelper.writeMessage(message);
        }

        protected void informAboutAddingNewUser(String userName)
        {
            ConsoleHelper.writeMessage("New user: " + userName);
        }

        protected void informAboutDeletingNewUser(String userName)
        {
            ConsoleHelper.writeMessage("User removed: " + userName);
        }

        protected void notifyConnectionStatusChanged(boolean clientConnected)
        {
            Client.this.clientConnected = clientConnected;
            synchronized (Client.this)
            {
                Client.this.notify();
            }
        }

        protected void clientHandshake() throws IOException, ClassNotFoundException
        {
            String name;
            Message mes;
            while(true) {
                mes = connection.receive();
                if(mes.getType()==MessageType.NAME_REQUEST)
                {
                    name  = getUserName();
                    connection.send(new Message(MessageType.USER_NAME,name));
                }
                else if(mes.getType()==MessageType.NAME_ACCEPTED) {
                    notifyConnectionStatusChanged(true); return;
                }
                else throw new IOException("Unexpected MessageType");

            }

        }

        protected void clientMainLoop() throws IOException, ClassNotFoundException
        {
            Message mes;
            while(true) {
                mes = connection.receive();
                if(mes.getType()==MessageType.TEXT)
                {

                    processIncomingMessage(mes.getData());
                }
                else if(mes.getType()==MessageType.USER_ADDED)
                    informAboutAddingNewUser(mes.getData());
                else if(mes.getType()==MessageType.USER_REMOVED)
                    informAboutDeletingNewUser(mes.getData());
                else throw new IOException("Unexpected MessageType");

            }

        }

        public void run()
        {
            String servAdres = getServerAddress();
            int servPort = getServerPort();

            try {
                Socket socket = new Socket(servAdres,servPort);
                Client.this.connection = new Connection(socket);
                clientHandshake();
                clientMainLoop();
            } catch (IOException e) {
                notifyConnectionStatusChanged(false);
                ConsoleHelper.writeMessage("Error Clien 1");
            } catch (ClassNotFoundException e) {
                notifyConnectionStatusChanged(false);
                ConsoleHelper.writeMessage("Error Clien 2");
            }
        }
    }

    protected String getServerAddress()
    {
        ConsoleHelper.writeMessage("Enter adress: ");
        return ConsoleHelper.readString();
    }

    protected int getServerPort()
    {
        ConsoleHelper.writeMessage("Enter port: ");
        return ConsoleHelper.readInt();
    }

    protected String getUserName()
    {
        ConsoleHelper.writeMessage("Enter Username: ");
        return ConsoleHelper.readString();
    }

    protected boolean shouldSendTextFromConsole()
    {
        return true;
    }

    protected SocketThread getSocketThread()
    {
        return new SocketThread();
    }
    protected void sendTextMessage(String text)
    {
        try {
            connection.send(new Message(MessageType.TEXT,text));
        } catch (IOException e) {
            clientConnected = false;
            ConsoleHelper.writeMessage("Error!!");

        }
    }

    public void run(){
      SocketThread socketThread = getSocketThread();
       socketThread.setDaemon(true);
       socketThread.start();
       synchronized (this) {
           try {
               this.wait();
           } catch (InterruptedException e) {
                ConsoleHelper.writeMessage("Error interrupt");
           }
       }

       if(clientConnected)
           ConsoleHelper.writeMessage("Соединение установлено. Для выхода наберите команду 'exit'.");
       else ConsoleHelper.writeMessage("Произошла ошибка во время работы клиента.");

        while(clientConnected) {
            String line = ConsoleHelper.readString();
            if (line.equals("exit")) break;
            if (shouldSendTextFromConsole()) sendTextMessage(line);
        }
    }
}
