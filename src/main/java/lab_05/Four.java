package lab_05;

public class Four {
    public static void main(String[] args) {

        // 4. Дан двумерный массив, содержащий отрицательные и положительные числа.
        // Выведете на экран номера тех ячеек массива, которые содержат отрицательные числа.

        int[][] arrayMatrix = {
                {1, 2, 3},
                {-4, 5, 6},
                {7, -8, 9}
        };

        for (int i = 0; i < arrayMatrix.length; i++){
            for (int j = 0; j < arrayMatrix[i].length; j++) {
                if (arrayMatrix[i][j] < 0){
                    System.out.println("Ячейка с отрицательным числом: " + i + "-" + j);
                }
            }
        }

    }
}
