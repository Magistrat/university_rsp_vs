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
        int max_numb;

        if (oneNumb >= twoNumb && oneNumb >= threeNumb && oneNumb >= fourNumb) {
            max_numb = oneNumb;
        } else if (twoNumb >= oneNumb && twoNumb >= threeNumb && twoNumb >= fourNumb) {
            max_numb = twoNumb;
        } else if (threeNumb >= oneNumb && threeNumb >= twoNumb && threeNumb >= fourNumb) {
            max_numb = threeNumb;
        } else {
            max_numb = fourNumb;
        }

        return max_numb;
    }


    public static int getCountOfMaxNumb(int max_numb, int oneNumb, int twoNumb, int threeNumb, int fourNumb){
        // Возвращает количество максимальных чисел (сколько раз максимальное число повторилось)
        // max_numb: int - Максимальное число
        // oneNumb, ... : int - Перечисление чисел

        byte count_of_max = 0;

        if (max_numb == oneNumb)
            count_of_max ++;
        if (max_numb == twoNumb)
            count_of_max ++;
        if (max_numb == threeNumb)
            count_of_max ++;
        if (max_numb == fourNumb)
            count_of_max ++;

        return count_of_max;
    }
}
