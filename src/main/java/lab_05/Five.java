package lab_05;

import java.util.Arrays;
import java.util.Random;

public class Five {
    public static void main(String[] args) {

        // 5. Отсортируйте элементы в строках двумерного массива по возрастанию.'

        int[][] arrayMatrix = new int[7][4];
        Random random = new Random();

        for (int i = 0; i < arrayMatrix.length; i++) {
            for (int j = 0; j < arrayMatrix[i].length; j++) {
                arrayMatrix[i][j] = random.nextInt(100);
            }
        }

        for (int i = 0; i < arrayMatrix.length; i++) {
            Arrays.sort(arrayMatrix[i]);
        }

        for (int i = 0; i < arrayMatrix.length; i++) {
            System.out.println(Arrays.toString(arrayMatrix[i]));
        }

    }
}
