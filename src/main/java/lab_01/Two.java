package lab_01;

public class Two {
    public static void main(String[] args) {

        // 2. Вывести на консоль количество максимальных чисел седи чисел из задания 1.

        int oneNumb = 2;
        int twoNumb = 5;
        int threeNumb = 8;
        int fourNumb = 15;

        // Получение максимального числа
        int maxNumb;
        maxNumb = getMaxNumb(oneNumb, twoNumb, threeNumb, fourNumb);

        // Получение повторение максимального числа
        int countOfMaxNumb;
        countOfMaxNumb = getCountOfMaxNumb(maxNumb, oneNumb, twoNumb, threeNumb, fourNumb);

        System.out.println(countOfMaxNumb);
    }

    public static int getMaxNumb(int oneNumb, int twoNumb, int threeNumb, int fourNumb){
        // Возвращает максимальное число
        int maxNumb = oneNumb;

        if (twoNumb > maxNumb) {
            maxNumb = twoNumb;
        }
        if (threeNumb > maxNumb) {
            maxNumb = threeNumb;
        }
        if (fourNumb > maxNumb) {
            maxNumb = fourNumb;
        }

        return maxNumb;
    }


    public static int getCountOfMaxNumb(int maxNumb, int oneNumb, int twoNumb, int threeNumb, int fourNumb){
        // Возвращает количество максимальных чисел (сколько раз максимальное число повторилось)
        // maxNumb: int - Максимальное число
        // oneNumb, ... : int - Перечисление чисел
        byte countOfMax = 0;

        if (maxNumb == oneNumb)
            countOfMax ++;
        if (maxNumb == twoNumb)
            countOfMax ++;
        if (maxNumb == threeNumb)
            countOfMax ++;
        if (maxNumb == fourNumb)
            countOfMax ++;

        return countOfMax;
    }
}
