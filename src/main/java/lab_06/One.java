package lab_06;

public class One {
    public static void main(String[] args) {

        // 1. Дан массив целых чисел, найти среди элементов массива числа, которые делятся на 3 и на 6.

        int[] arrayOfDigit = new int[] {3, 4, 7, 9, 34, 67, 89, 54, 4739, 294,5892, 92505};

        for (int i = 0; i < arrayOfDigit.length; i++){
            if (arrayOfDigit[i] % 3 == 0){
                System.out.println("Число делится на 3: " + arrayOfDigit[i]);
            }
            if (arrayOfDigit[i] % 6 == 0){
                System.out.println("Число делится на 6: " + arrayOfDigit[i]);
            }


        }
    }
}
