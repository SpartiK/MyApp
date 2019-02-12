package lesson12.HW;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ffff {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\w+\\s");
        Matcher matcher = pattern.matcher("fffff ab f 1234 jkjk");
        boolean b = matcher.matches();
        System.out.println(b);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
