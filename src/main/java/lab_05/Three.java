package lab_05;

import java.util.Random;

public class Three {
    public static void main(String[] args) {

        // 3. Просуммируйте все элементы двумерного массива.

        int[][] matrixTriple = new int[3][3];

        Random random = new Random();
        for (int i = 0; i < matrixTriple.length; i++) {
            for (int j = 0; j < matrixTriple[i].length; j++) {
                matrixTriple[i][j] = random.nextInt(100);
            }
        }

        int sumOfEveryMatrixItem = 0;
        for (int i = 0; i < matrixTriple.length; i++) {
            for (int j = 0; j < matrixTriple[i].length; j++) {
                sumOfEveryMatrixItem += matrixTriple[i][j];
            }
        }

        System.out.println("Сумма всех элементов двумерного массива: " + sumOfEveryMatrixItem);

    }
}
