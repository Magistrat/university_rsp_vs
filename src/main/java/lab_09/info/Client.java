package lab_09.info;

import java.net.*;

public class Client {

    public static void main(String[] arg) throws Exception {
        InetAddress address = InetAddress.getByName("233.0.0.1");
        System.out.println("Ожидание сообщения от сервера");

        // Создание объекта MulticastSocket для получения данных от группы, используя номер порта 1502
        try (MulticastSocket socket = new MulticastSocket(1502)) {
            // Регистрация клиента в группе
            socket.joinGroup(address);
            while (true) {
                // Создание буфера для хранения данных
                byte[] buffer = new byte[256];
                // Создание дейтаграммы, связывание с буфером
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                // Получение данных от сервера
                socket.receive(packet);
                // Получение данных из дейтаграммы
                String str = new String(packet.getData());
                // Вывод сообщения на экран
                System.out.println("Получено сообщение: " + str.trim());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}