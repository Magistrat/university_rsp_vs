package lab_10.info;

import java.io.Serializable;
import java.util.Date;

public class DateMessage implements Serializable {
    // Поле для хранения даты и времени
    private Date date;

    // Поле для хранения текстового сообщения
    private String message;

    // Конструктор класс
    public DateMessage(Date date, String message) {
        this.date = date;
        this.message = message;
    }

    // Геттер date
    public Date getDate() {
        return date;
    }

    // Сеттер date
    public void setDate(Date date) {
        this.date = date;
    }

    // Геттер message
    public String getMessage() {
        return message;
    }

    // Сеттер message
    public void setMessage(String message) {
        this.message = message;
    }

}