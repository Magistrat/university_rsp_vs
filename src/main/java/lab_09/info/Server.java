package lab_09.info;

import java.io.*;
import java.net.*;

public class Server {
    public Server() throws IOException {
        System.out.println("Sending messages");
        // Вызов метода transmit() для передачи сообщение всем клиентам, зарегистрированным в группе
        transmit("233.0.0.1");
    }

    public void transmit(String ipGroup) {
        // Создается объект DatagramSocket для приема запросов клиента
        try (DatagramSocket socket = new DatagramSocket()) {
            // создается входной поток для приема данных с консоли
            try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
                while (true) {
                    System.out.println("Введите строку для передачи клиентам: ");
                    // Чтение из консоли
                    String str = in.readLine();
                    // Преобразование строки в байты
                    byte[] buffer = str.getBytes();
                    // Получение ip-адреса
                    InetAddress address = InetAddress.getByName(ipGroup);
                    // Посылка пакета датаграмм на порт номер 1502
                    DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, 1502);
                    // Посылка сообщений всем клиентам в группе
                    socket.send(packet);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] arg) throws Exception {
        // Запуск сервера
        new Server();
    }
}