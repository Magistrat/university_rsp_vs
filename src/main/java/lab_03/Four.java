package lab_03;

import java.util.Arrays;

public class Four {
    public static void main(String[] args){

        // 4. Поменять наибольший и наименьший элементы массива местами.
        // Пример: дан массив {4, -5, 0, 6, 8}. После замены будет выглядеть {4, 8, 0, 6, 5}.

        int[] oddNumbers = {33, 13, 15, 99, 89};
        System.out.println(Arrays.toString(oddNumbers));

        int minimalIndexInArray = getMinimalIndexInArray(oddNumbers);
        int maxIndexInArray = getMaxIndexInArray(oddNumbers);

        int minimalInArray = oddNumbers[minimalIndexInArray];
        int maxInArray = oddNumbers[maxIndexInArray];

        oddNumbers[minimalIndexInArray] = maxInArray;
        oddNumbers[maxIndexInArray] = minimalInArray;

        System.out.println(Arrays.toString(oddNumbers));
    }

    public static int getMinimalIndexInArray(int[] array){
        // Получение индекса минимального числа в массиве
        int minimalIndexNumberInArray = 0;

        for (int i = 1; i < array.length; i++){
            if (array[i] < array[minimalIndexNumberInArray]) {
                minimalIndexNumberInArray = i;
            }
        }

        return minimalIndexNumberInArray;
    }

    public static int getMaxIndexInArray(int[] array){
        // Получение индекса максимального числа в массиве
        int maxIndexNumberInArray = 0;

        for (int i = 1; i < array.length; i++){
            if (array[i] > array[maxIndexNumberInArray]) {
                maxIndexNumberInArray = i;
            }
        }

        return maxIndexNumberInArray;
    }

}
