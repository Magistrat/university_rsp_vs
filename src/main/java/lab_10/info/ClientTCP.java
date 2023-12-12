package lab_10.info;

import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientTCP {
    public static void main(String[] args) {
        // Создается объект Socket для соединения с сервером

        try (Socket clientSocket = new Socket("localhost", 1500)) {
            // Получаем ссылку на поток, связанный с сокетом
            try (ObjectInputStream in = new ObjectInputStream(clientSocket.getInputStream())) {

                // Извлекаем объект из входного потока
                DateMessage dateMessage = (DateMessage) in.readObject();

                // Выводим полученные данные на консоль
                System.out.println(dateMessage.getMessage());
                System.out.println(dateMessage.getDate());

                // Реализация ожидания, чтобы программа не выключалась сразу
                System.out.println("Нажмите Enter для выхода...");
                Scanner scanner = new Scanner(System.in);
                scanner.nextLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
