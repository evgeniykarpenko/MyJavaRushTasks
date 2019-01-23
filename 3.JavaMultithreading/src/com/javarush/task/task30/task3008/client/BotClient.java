package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.ConsoleHelper;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

public class BotClient extends Client {

    public class BotSocketThread extends SocketThread {
        @Override
        protected void clientMainLoop() throws IOException, ClassNotFoundException {
            sendTextMessage("Привет чатику. Я бот. Понимаю команды: дата, день, месяц, год, время, час, минуты, секунды.");
            super.clientMainLoop();
        }

        @Override
        protected void processIncomingMessage(String message) {
            ConsoleHelper.writeMessage(message);
            String answer = null;
            String separator = ":";
            String results[];

            if (message.contains(": ")) {
                results = message.split(": ");
                Calendar calendar = Calendar.getInstance();
                Date date = calendar.getTime();
                SimpleDateFormat dateFormat = null;
                switch (results[1]) {
                    case ("дата"):
                        dateFormat = new SimpleDateFormat("d.MM.YYYY");
                        sendTextMessage("Информация для " + results[0] + ": " + dateFormat.format(date));
                        break;
                    case ("день"):
                        dateFormat = new SimpleDateFormat("d");
                        sendTextMessage("Информация для " + results[0] + ": " + dateFormat.format(date));
                        break;
                    case ("месяц"):
                        dateFormat = new SimpleDateFormat("MMMM");
                        sendTextMessage("Информация для " + results[0] + ": " + dateFormat.format(date));
                        break;
                    case ("год"):
                        dateFormat = new SimpleDateFormat("YYYY");
                        sendTextMessage("Информация для " + results[0] + ": " + dateFormat.format(date));
                        break;
                    case ("время"):
                        dateFormat = new SimpleDateFormat("H:mm:ss");
                        sendTextMessage("Информация для " + results[0] + ": " + dateFormat.format(date));
                        break;
                    case ("час"):
                        dateFormat = new SimpleDateFormat("H");
                        sendTextMessage("Информация для " + results[0] + ": " + dateFormat.format(date));
                        break;
                    case ("минуты"):
                        dateFormat = new SimpleDateFormat("m");
                        sendTextMessage("Информация для " + results[0] + ": " + dateFormat.format(date));
                        break;
                    case ("секунды"):
                        dateFormat = new SimpleDateFormat("s");
                        sendTextMessage("Информация для " + results[0] + ": " + dateFormat.format(date));
                        break;
                }

            }
        }
    }

    public static void main(String[] args) {
        BotClient botClient = new BotClient();
        botClient.run();
    }

    @Override
    protected String getUserName() {
        return ("date_bot_" + (int) (Math.random() * 100));
    }

    @Override
    protected boolean shouldSendTextFromConsole() {
        return false;
    }

    @Override
    protected SocketThread getSocketThread() {
        return new BotSocketThread();
    }

}
