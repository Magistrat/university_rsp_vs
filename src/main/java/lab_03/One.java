package lab_03;

public class One {
    public static void main(String[] args) {

        // 1. Создайте массив, содержащий 10 первых нечетных чисел.
        // Выведете элементы массива на консоль в одну строку, разделяя запятой.

        int[] firstOddNumbers = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        for (int i = 0; i < firstOddNumbers.length; i++){
            if (i == 0){
                System.out.print(firstOddNumbers[i]);
            } else {
                System.out.print(", " + firstOddNumbers[i]);
            }
        }

    }
}
