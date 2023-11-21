package lab_05;

import java.util.Random;

public class One {
    public static void main(String[] args){

        // 1. Создайте массив размерностью 5 на 6
        // и заполните его случайными числами (в диапазоне от 0 до 99).
        // Выведите на консоль третью строку.

        int[][] arrayFiveOnSix = new int[5][6];
        Random random = new Random();

        for (int i = 0; i < arrayFiveOnSix.length; i++) {
            for (int j = 0; j < arrayFiveOnSix[i].length; j++) {
                arrayFiveOnSix[i][j] = random.nextInt(100);
            }
        }

        for (int j = 0; j < 6; j++) {
            System.out.println(arrayFiveOnSix[2][j]);
        }

    }
}
