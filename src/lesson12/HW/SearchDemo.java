package lesson12.HW;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchDemo {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[A-z]+\\s");
        Matcher matcher = pattern.matcher("One two three раз два три one1 two2 123 ");
        int count = 0;
        while (matcher.find()){
            count++;
        }
        System.out.println("Количнство слов - "+ count);
    }
}
