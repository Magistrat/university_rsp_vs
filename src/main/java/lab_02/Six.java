package lab_02;

public class Six {
    public static void main(String[] args) {

        // 6. Переделайте пример для оператора break (в котором выполнялся поиск символа в строке).
        // Необходимо, чтобы заданный символ встречался в строке хотя бы 2 раза.
        // Программа должна подсчитывать число вхождений символа в строке и выводить это число в консоль.


        int requiredOfCountChar = 2;
        String searchMe = "Мама мыла раму";
        int max = searchMe.length();
        char symb = 'ы';
        boolean find = false;

        int countOfChar = 0;
        for (int i = 0; i < max; i++) {
        // если символ на позиции i в строке равен искомому символу
            if (searchMe.charAt(i) == symb) {
                countOfChar++;
                if (countOfChar == requiredOfCountChar){
                    find = true;
                    break;
                }

            }
        }

        // выводим соответствующее сообщение: найден или не найден символ
        if (find) {
            System.out.println("Символ '" + symb + "' найден в строке " + requiredOfCountChar + " раза");
        } else {
            System.out.println("Символ '" + symb + "' не найден в строке " + requiredOfCountChar + " раза");
        }


    }
}
