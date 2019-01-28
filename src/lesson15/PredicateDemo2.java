package lesson15;

import java.sql.SQLOutput;
import java.util.function.Predicate;

public class PredicateDemo2 {
    public static void main(String[] args) {
        Predicate<String> predicate1 = s -> s.startsWith("J");
        Predicate<String> predicate2 = s -> s.startsWith("N");
        Predicate<String> predicate3 = s -> s.endsWith("A");
        Predicate<String> predicate = predicate1.or(predicate2).and(predicate3);

        System.out.println(predicate.test("JavA"));
        System.out.println(predicate.test("Jav"));
        System.out.println(predicate.test("Net"));
        System.out.println(predicate.test("NetA"));

    }
}

