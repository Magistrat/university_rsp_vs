package lab_03;

import java.util.Arrays;

public class Five {
    public static void main(String[] args){

        // 5. Найти среднее арифметическое всех элементов массива.

        int[] oddNumbers = {33, 13, 15, 99, 89};

        int sumOfEveryNumberInArray = 0;
        for (int i = 0; i < oddNumbers.length; i++){
            sumOfEveryNumberInArray += oddNumbers[i];
        }

        double average = (double) sumOfEveryNumberInArray/oddNumbers.length;
        System.out.println("Среднее арифметическое " + Arrays.toString(oddNumbers) + " - " + average);
    }
}
