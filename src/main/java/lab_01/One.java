package lab_01;

public class One {
    public static void main(String[] args) {

        // 1. Даны 4 числа типа int. Сравнить их и вывести наименьшее на консоль.

        int oneNumb = 2;
        int twoNumb = 5;
        int threeNumb = 8;
        int fourNumb = 15;

        int minimal_numb;
        minimal_numb = getMinimalNumb(oneNumb, twoNumb, threeNumb, fourNumb);
        System.out.println(minimal_numb);
    }

    public static int getMinimalNumb(int oneNumb, int twoNumb, int threeNumb, int fourNumb){
        // Возвращает минимальное число
        int minimal_numb;

        if (oneNumb <= twoNumb && oneNumb <= threeNumb && oneNumb <= fourNumb) {
            minimal_numb = oneNumb;
        } else if (twoNumb <= oneNumb && twoNumb <= threeNumb && twoNumb <= fourNumb) {
            minimal_numb = twoNumb;
        } else if (threeNumb <= oneNumb && threeNumb <= twoNumb && threeNumb <= fourNumb) {
            minimal_numb = threeNumb;
        } else {
            minimal_numb = fourNumb;
        }

        return minimal_numb;
    }
}
