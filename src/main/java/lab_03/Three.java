package lab_03;

public class Three {
    public static void main(String[] args){

        // 3. В массиве из задания 2 найти наибольший элемент.
        int[] oddNumbers = {111, 33, 15, 99, 89, 131, 143, 159, 137, 9, 159};

        int[] arrayWithTwoMax = getTwoMaximalNumberInArray(false, oddNumbers);
        System.out.println(arrayWithTwoMax[0] + ", " + arrayWithTwoMax[1]);

        int[] arrayWithTwoMaxTheSame = getTwoMaximalNumberInArray(true, oddNumbers);
        System.out.println(arrayWithTwoMaxTheSame[0] + ", " + arrayWithTwoMaxTheSame[1]);
    }

    public static int[] getTwoMaximalNumberInArray(boolean hasSameMax, int[] array){
        // hasSameMax - Флаг возврата при повторения максимальных чисел в массиве
        // array - Массив
        int maxNumbInArray = getMaxInArray(array);

        int[] returnMaxArray;
        returnMaxArray = new int[2];
        returnMaxArray[0] = maxNumbInArray;

        if (hasSameMax){
            int countOfMaxTheSameNumber = 0; // Счетчик если максимальных чисел в Массиве
            for (int i = 0; i < array.length; i++){
                if (array[i] == maxNumbInArray){
                    countOfMaxTheSameNumber++;
                    if (countOfMaxTheSameNumber >= 2){
                        returnMaxArray[1] = maxNumbInArray;
                        return returnMaxArray;
                    }
                }
            }
        }

        int secondMaxNumber = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] != maxNumbInArray && array[i] > secondMaxNumber){
                secondMaxNumber = array[i];
            }
        }
        returnMaxArray[1] = secondMaxNumber;
        return returnMaxArray;

    }

    public static int getMaxInArray(int[] array){
        // Получение максимального числа в массиве
        int maxNumberInArray = array[0];

        for (int i = 1; i < array.length; i++){
            if (array[i] > maxNumberInArray) {
                maxNumberInArray = array[i];
            }
        }

        return maxNumberInArray;
    }
}
