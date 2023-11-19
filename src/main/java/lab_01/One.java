package lab_01;

public class One {
    public static void main(String[] args) {

        // 1. Даны 4 числа типа int. Сравнить их и вывести наименьшее на консоль.

        int oneNumb = 2;
        int twoNumb = 5;
        int threeNumb = 8;
        int fourNumb = 15;

        int minimalNumb;
        minimalNumb = getMinimalNumb(oneNumb, twoNumb, threeNumb, fourNumb);
        System.out.println(minimalNumb);
    }

    public static int getMinimalNumb(int oneNumb, int twoNumb, int threeNumb, int fourNumb){
        // Возвращает минимальное число
        int minimalNumb = oneNumb;

        if (twoNumb < minimalNumb) {
            minimalNumb = twoNumb;
        }
        if (threeNumb < minimalNumb) {
            minimalNumb = threeNumb;
        }
        if (fourNumb < minimalNumb) {
            minimalNumb = fourNumb;
        }

        return minimalNumb;
    }
}
