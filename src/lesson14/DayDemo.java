package lesson14;

import java.time.LocalDate;
import java.util.Locale;

public class DayDemo {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1997,4,21);
        System.out.println("Год: " + birthday.getYear());
        System.out.println("Месяц: " + (birthday.getMonthValue()));
        System.out.println("Название месяца: " + birthday.getMonth());
        System.out.println("День в году: " + birthday.getDayOfYear());
        System.out.println("День месяца: " + birthday.getDayOfMonth());
        System.out.println("День недели: " + birthday.getDayOfWeek());
        LocalDate day = LocalDate.of(1997,4,21);
        LocalDate now = LocalDate.now();
        System.out.println(now.isAfter(birthday));
        System.out.println(now.isBefore(birthday));
        System.out.println(birthday.isLeapYear());

    }
}
