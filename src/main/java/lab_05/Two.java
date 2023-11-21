package lab_05;

import java.util.Random;

public class Two {
    public static void main(String[] args){

        // 2. Даны матрицы С и D размерностью 3 на 3 и заполненные случайными числами в диапазоне от 0 до 99.
        // Выполните по отдельности сначала сложение, потом умножения матриц друг на друга.
        // Выведете исходные матрицы и результат вычислений на консоль.

        int[][] matrixC = new int[3][3];
        int[][] matrixD = new int[3][3];

        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixC[i][j] = random.nextInt(100);
                matrixD[i][j] = random.nextInt(100);
            }
        }

        // Вывод Матриц
        printTripleMatrix(matrixC);
        printTripleMatrix(matrixD);

        System.out.println("Сумма матриц: ");
        printTripleMatrix(
                sumMatrix(matrixC, matrixD)
        );

        System.out.println("Произведение матриц: ");
        printTripleMatrix(
                multiplyMatrix(matrixC, matrixD)
        );
    }

    public static void printTripleMatrix(int[][] matrixForPrint){
        // Метод для печати матриц
        for (int i = 0; i < matrixForPrint.length; i++) {
            for (int j = 0; j < matrixForPrint[i].length; j++) {
                System.out.print(matrixForPrint[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] sumMatrix(int[][] firstMatrix, int[][] secondMatrix) {
        // Метод для складывания трехмерных матриц
        int[][] tempSumMatrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tempSumMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        return tempSumMatrix;
    }

    public static int[][] multiplyMatrix(int[][] firstMatrix, int[][] secondMatrix) {
        // Метод для умножения трехмерных матриц
        int[][] tempMultiplyMatrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tempMultiplyMatrix[i][j] = firstMatrix[i][j] * secondMatrix[i][j];
            }
        }
        return tempMultiplyMatrix;
    }
}
