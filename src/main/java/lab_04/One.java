package lab_04;

import java.util.Arrays;
import java.util.Random;

public class One {
    public static void main(String[] args) {
        // Создайте массив из 20 случайных чисел (числа должны быть в диапазоне от 0 до 1000)
        // и отсортируйте массив по убыванию при помощи сортировки пузырьком.

        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }

        System.out.println(Arrays.toString(
                sortByBubble(array)
        ));

    }

    public static int[] sortByBubble(int[] oldBubble) {
        // Временные переменные
        int temp_one;
        int temp_two;

        for (int i = 0; i < oldBubble.length - 1; i++) {
            for (int j = 0; j < oldBubble.length - 1; j++) {
                if (oldBubble[j] < oldBubble[j + 1]) {
                    temp_one = oldBubble[j];
                    temp_two = oldBubble[j + 1];
                    oldBubble[j] = temp_two;
                    oldBubble[j + 1] = temp_one;
                }
            }
        }
        return oldBubble;
    }

}
