package lab_03;

public class One {
    public static void main(String[] args) {

        // 1. Создайте массив, содержащий 10 первых нечетных чисел.
        // Выведете элементы массива на консоль в одну строку, разделяя запятой.

        int lengthArray = 10;
        int[] firstOddNumbers = new int[lengthArray];

        int j = 0;
        while (j < lengthArray){
            firstOddNumbers[j] = 1 + (j * 2);
            j++;
        }

        for (int i = 0; i < firstOddNumbers.length; i++){
            if (i == 0){
                System.out.print(firstOddNumbers[i]);
            } else {
                System.out.print(", " + firstOddNumbers[i]);
            }
        }

    }
}
