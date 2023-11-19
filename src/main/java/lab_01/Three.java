package lab_01;

public class Three {
    public static void main(String[] args) {
        // 3. Даны 5 чисел (тип int). Вывести вначале наименьшее, а затем наибольшее из данных чисел.

        int oneNumb = 2;
        int twoNumb = 5;
        int threeNumb = 8;
        int fourNumb = 15;
        int fiveNumb = 21;

        System.out.println(
                "Минимальное число: " + getMinimalOfFiveNumb(oneNumb, twoNumb, threeNumb, fourNumb, fiveNumb)
        );
        System.out.println(
                "Максимальное число: " + getMaxOfFiveNumb(oneNumb, twoNumb, threeNumb, fourNumb, fiveNumb)
        );
    }

    public static int getMaxOfFiveNumb(int oneNumb, int twoNumb, int threeNumb, int fourNumb, int fiveNumb) {
        // Возвращает максимальное число
        int maxNumb;

        if (oneNumb >= twoNumb && oneNumb >= threeNumb && oneNumb >= fourNumb && oneNumb >= fiveNumb) {
            maxNumb = oneNumb;
        } else if (twoNumb >= oneNumb && twoNumb >= threeNumb && twoNumb >= fourNumb && twoNumb >= fiveNumb) {
            maxNumb = twoNumb;
        } else if (threeNumb >= oneNumb && threeNumb >= twoNumb && threeNumb >= fourNumb && threeNumb >= fiveNumb) {
            maxNumb = threeNumb;
        } else if (fourNumb >= oneNumb && fourNumb >= twoNumb && fourNumb >= threeNumb && fourNumb >= fiveNumb) {
            maxNumb = fourNumb;
        } else {
            maxNumb = fiveNumb;
        }

        return maxNumb;
    }


    public static int getMinimalOfFiveNumb(int oneNumb, int twoNumb, int threeNumb, int fourNumb, int fiveNumb) {
        // Возвращает минимальное число
        int minimalNumb;

        if (oneNumb <= twoNumb && oneNumb <= threeNumb && oneNumb <= fourNumb && oneNumb <= fiveNumb) {
            minimalNumb = oneNumb;
        } else if (twoNumb <= oneNumb && twoNumb <= threeNumb && twoNumb <= fourNumb && twoNumb <= fiveNumb) {
            minimalNumb = twoNumb;
        } else if (threeNumb <= oneNumb && threeNumb <= twoNumb && threeNumb <= fourNumb && threeNumb <= fiveNumb) {
            minimalNumb = threeNumb;
        } else if (fourNumb <= oneNumb && fourNumb <= twoNumb && fourNumb <= threeNumb && fourNumb <= fiveNumb) {
            minimalNumb = fourNumb;
        } else {
            minimalNumb = fiveNumb;
        }

        return minimalNumb;
    }

}
