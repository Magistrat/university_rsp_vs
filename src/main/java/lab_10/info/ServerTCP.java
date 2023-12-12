package lab_10.info;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;

public class ServerTCP extends Thread {
    // Объявляется ссылка на объект - сокет сервера
    ServerSocket serverSocket = null;
    public ServerTCP() {
        try {
            // Создается объект ServerSocket, который получает запросы клиента на порт 1500
            serverSocket = new ServerSocket(1500);
            System.out.println("Запуск сервера");
            // Запускаем процесс, неявно вызывается метод run()
            start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Метод класс Thread, который необходимо переопределить
    @Override
    public void run() {
        try {
            while (true) {
                // Ожидание запросов на соединение от клиентов
                Socket clientSocket = serverSocket.accept();
                System.out.println("Принято соединение " + clientSocket.getInetAddress().getHostAddress());

                // Получение выходного потока, связанного с объектом Socket
                try (ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream())) {
                    // Создание объекта для передачи клиентам
                    DateMessage dateMessage =
                            new DateMessage(Calendar.getInstance().getTime(), "Текущая дата/время на сервере");

                    // Запись объекта в выходной поток
                    out.writeObject(dateMessage);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Закрытие сокета
                serverSocket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        // Запуск сервера
        new ServerTCP();
    }
}
