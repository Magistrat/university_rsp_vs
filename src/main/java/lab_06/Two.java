package lab_06;

public class Two {
    public static void main(String[] args){

        // 2. Посчитать среднее арифметическое чисел в массиве

        int[] arrayOfDigit = new int[] {3, 4, 7, 9, 34, 67, 89, 54, 4739, 294,5892, 92505};
        int sumOfDigit = 0;

        for (int i = 0; i < arrayOfDigit.length; i++){
            sumOfDigit += arrayOfDigit[i];
        }

        System.out.println("Среднее арифметическое чисел: " + (float)sumOfDigit/arrayOfDigit.length);
    }
}
