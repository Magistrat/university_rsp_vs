package lab_07;

public class Run {
    public static void main(String[] args){
        // Описать класс, реализующий шестнадцатеричный счетчик,
        // который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне.
        // Предусмотреть инициализацию счетчика значениями по умолчанию и произвольными значениями.
        // Счетчик имеет два метода: увеличения и уменьшения, — и метод, позволяющее получить его текущее состояние.
        // При выходе за границы диапазона выбрасываются исключения.

        // Cчетчик со случайным числом
        CounterSixteen counterRandom = new CounterSixteen();
        System.out.println("Текущее число (инициализация со случайным числом): " + counterRandom.getNumber());
        counterRandom.add();
        counterRandom.add();
        System.out.println("Текущее число (увеличие 2 раза): " + counterRandom.getNumber());
        counterRandom.pop();
        System.out.println("Текущее число (уменьшение 1 раз): " + counterRandom.getNumber());

        System.out.println();
        CounterSixteen counterCustom = new CounterSixteen(10);
        System.out.println("Текущее число (инициализация с заданым числом): " + counterCustom.getNumber());
        counterCustom.add();
        counterCustom.add();
        counterCustom.add();
        counterCustom.pop();
        System.out.println("Текущее число (увеличие 3 раза, уменьшение 1 раз): " + counterCustom.getNumber());

        System.out.println();
        System.out.println("Инициализация с числом больше 16");
        new CounterSixteen(17);
    }
}
