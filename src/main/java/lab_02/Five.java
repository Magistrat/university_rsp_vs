package lab_02;

public class Five {
    public static void main(String[] args) {

        // 5. Вывести 10 первых чисел последовательности {0, -5, -10, -15, …}.

        final int startNumber = 0;
        final int stepForGetNextResult = -5;
        final int countOfSequences = 10;

        for (int i = 0; i < countOfSequences; i++) {
            System.out.println(startNumber + (stepForGetNextResult * i));
        }

    }
}
