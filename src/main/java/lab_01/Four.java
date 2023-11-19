package lab_01;

public class Four {
    public static void main(String[] args) {
        System.out.println(
                "Костя и Костя: " + isNameSake("Костя", "Костя")
        );

        System.out.println(
                "Маша и Костя: " + isNameSake("Маша", "Костя")
        );
    }

    public static String isNameSake(String firstName, String secondName) {
        // Проверяет что имена являются одинаковыми
        // Возвращает строку в зависимости от результата

        String trueNameSake = "Являются тёзками";
        String falseNameSake = "Не являются тёзками";

        if (firstName.equals(secondName)){
            return trueNameSake;
        } else {
            return falseNameSake;
        }
    }
}
