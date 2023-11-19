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
        int maxNumb;

        if (oneNumb >= twoNumb && oneNumb >= threeNumb && oneNumb >= fourNumb) {
            maxNumb = oneNumb;
        } else if (twoNumb >= oneNumb && twoNumb >= threeNumb && twoNumb >= fourNumb) {
            maxNumb = twoNumb;
        } else if (threeNumb >= oneNumb && threeNumb >= twoNumb && threeNumb >= fourNumb) {
            maxNumb = threeNumb;
        } else {
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
