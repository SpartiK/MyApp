package lesson12.HW;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Palindrome {
    public static void main(String[] args) {
        String s, srevers;
        Pattern pattern = Pattern.compile("\\d{2,20}");
        Matcher matcher = pattern.matcher("Если есть хвосты по дз, начните с 1 не сданного задания.  123 324 111 4554\n");
        Palindrome(matcher);
    }

    private static void Palindrome(Matcher matcher) {
        String s;
        String srevers;
        while (matcher.find()) {
            StringBuilder stringBuilder = new StringBuilder(matcher.group());
            s = stringBuilder.toString();
            srevers = stringBuilder.reverse().toString();
            if (s.equals(srevers)) {
                System.out.println(stringBuilder);
            }
        }
    }
}
