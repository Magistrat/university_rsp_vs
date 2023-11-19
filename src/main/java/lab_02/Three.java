package lab_02;

public class Three {
    public static void main(String[] args) {

        // 3. Выполните задания 1 и 2 с использованием цикла while.

        // При помощи цикла for вывести на экран нечетные числа от 1 до 99
        int i = 1;
        while (i < 100) {
            if (i % 2 != 0){
                System.out.println(i);
            }
            i++;
        }


        // Дано число n при помощи цикла for посчитать факториал n!
        int factorialFinish = 1;
        final int factorialForNumb = 5;

        int j = 1;
        while (j <= factorialForNumb) {
            factorialFinish *=j;
            j++;
        }
        System.out.println("Факториал " + factorialForNumb + ": " + factorialFinish);

    }
}
