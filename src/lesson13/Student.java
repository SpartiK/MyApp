package lesson13;

import java.util.Formatter;

public class Student {
    public static void student (String name,int mark, String subject) {
        System.out.printf("Студент %18s полуяил оценку %3d по предмету %20s%n", name, mark, subject);
    }
    public static void main(String[] args) {
        student("Никита Декар", 4, "Физика");
        student("Лиза Воскобойник", 2, "Программирование");
    }
}
