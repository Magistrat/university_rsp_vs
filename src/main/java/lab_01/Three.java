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
        if (fiveNumb > maxNumb) {
            maxNumb = fiveNumb;
        }

        return maxNumb;
    }


    public static int getMinimalOfFiveNumb(int oneNumb, int twoNumb, int threeNumb, int fourNumb, int fiveNumb) {
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
        if (fiveNumb < minimalNumb) {
            minimalNumb = fiveNumb;
        }

        return minimalNumb;
    }

}
