package lab_02;

public class Two {
    public static void main(String[] args) {

        // 2. Дано число n при помощи цикла for посчитать факториал n!

        int factorialFinish = 1;
        final int factorialForNumb = 5;

        for (int i = 1; i <= factorialForNumb; i++) {
            factorialFinish *= i;
        }

        System.out.println(factorialFinish);
    }
}
