package lab_01;

public class One {
    public static void main(String[] args) {

        // 1. Даны 4 числа типа int. Сравнить их и вывести наименьшее на консоль.

        int one_numb = 2;
        int two_numb = 5;
        int three_numb = 8;
        int four_numb = 15;

        int minimal_numb;
        minimal_numb = getMinimalNumb(one_numb, two_numb, three_numb, four_numb);
        System.out.println(minimal_numb);
    }

    public static int getMinimalNumb(int one_numb, int two_numb, int three_numb, int four_numb){
        // Получение минимального числа
        int minimal_numb;

        if (one_numb <= two_numb && one_numb <= three_numb && one_numb <= four_numb) {
            minimal_numb = one_numb;
        } else if (two_numb <= one_numb && two_numb <= three_numb && two_numb <= four_numb) {
            minimal_numb = two_numb;
        } else if (three_numb <= one_numb && three_numb <= two_numb && three_numb <= four_numb) {
            minimal_numb = three_numb;
        } else {
            minimal_numb = four_numb;
        }

        return minimal_numb;
    }
}
