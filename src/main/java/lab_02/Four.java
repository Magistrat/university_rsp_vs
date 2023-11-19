package lab_02;

public class Four {
    public static void main(String[] args) {

        // 4. Даны переменные x и n вычислить x в степени n

        final int number = 5;
        final int degreeForNumber = 2;

        int result = number;
        for (int i = 1; i < degreeForNumber; i++){
            result *= number;
        }

        System.out.println(result);

    }
}
