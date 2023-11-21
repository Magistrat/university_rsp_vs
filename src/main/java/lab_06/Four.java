package lab_06;

public class Four {
    public static void main(String[] args){

        // 4. Даны два целых числа, найти их наибольший общий делитель и наименьшее общее кратное.

        // Наибольший обощий делитель (алгоритм Евклида)
        double firstNumber = 30;
        double secondNumber = 18;

        System.out.println("Наибольший обощий делитель (алгоритм Евклида) :" + getMaxCommonDivine(firstNumber, secondNumber));
        System.out.println("Наименьшее общее кратное :" +
                ((firstNumber * secondNumber) / getMaxCommonDivine(firstNumber, secondNumber))
        );

    }

    public static double getMaxCommonDivine(double tempFirstNumber, double tempSecondNumber){
        while (tempFirstNumber != 0 && tempSecondNumber != 0){
            if (tempFirstNumber > tempSecondNumber){
                tempFirstNumber = tempFirstNumber % tempSecondNumber;
            } else {
                tempSecondNumber = tempSecondNumber % tempFirstNumber;
            }
        }
        return tempFirstNumber + tempSecondNumber;
    }
}
