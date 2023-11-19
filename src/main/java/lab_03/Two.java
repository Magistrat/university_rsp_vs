package lab_03;

public class Two {
    public static void main(String[] args) {
        // 2. Дан массив размерности N, найти наименьший элемент массива и вывести на консоль
        // (если наименьших элементов несколько — вывести их все).

        int[] oddNumbers = {111, 33, 15, 99, 89, 131, 143, 159, 137, 9};
        int minimalNumberInArray = getMinimalInArray(oddNumbers);

        for (int i = 0; i < oddNumbers.length; i++){
            if (oddNumbers[i] == minimalNumberInArray){
                System.out.println(oddNumbers[i]);
            }
        }
    }

    public static int getMinimalInArray(int[] array){
        // Получение минимального числа в массиве
        int minimalNumberInArray = array[0];

        for (int i = 1; i < array.length; i++){
            if (array[i] < minimalNumberInArray) {
                minimalNumberInArray = array[i];
            }
        }

        return minimalNumberInArray;
    }
}
