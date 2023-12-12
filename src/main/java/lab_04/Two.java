package lab_04;

import java.util.Arrays;
import static java.util.Collections.reverseOrder;


public class Two {
    public static void main(String[] args) {

        // Создайте массив, содержащий марки автомобилей, отсортируйте его сначала по возрастанию, потом по убыванию.

        String[] cars = new String[] {"Lada", "BMW", "Audi", "Ford", "Reno", "Kia"};
        System.out.println("Массив марок автомобилей: " + Arrays.toString(cars));

        Arrays.sort(cars);
        System.out.println("Отсортирован по возрастанию: " + Arrays.toString(cars));

        Arrays.sort(cars, reverseOrder());
        System.out.println("Отсортирован по убыванию: " + Arrays.toString(cars));

    }
}
