package lab_01;

public class Five {
    public static void main(String[] args) {

        // 5. Дано число месяца (тип int). Необходимо определить время года (зима, весна, лето, осень) и вывести на консоль.

        int monthNumb = 11;
        System.out.println(
                "Месяц с номером " + monthNumb + ": " + getYearSeasonByNumbOfMonth(monthNumb)
        );
    }

    public static String getYearSeasonByNumbOfMonth(int monthNumb) {
        // Возвращает сезон года по номеру месяца

        String yearSeason;

        switch (monthNumb){
            case 1:
            case 2:
            case 12:
                yearSeason = "Зима";
                break;
            case 3:
            case 4:
            case 5:
                yearSeason = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                yearSeason = "Лето";
                break;
            case 9:
            case 10:
            case 11:
                yearSeason = "Осень";
                break;
            default:
                yearSeason = "Не удалось определить";
        }

        return yearSeason;
    }
}
