package lesson12.HM3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringHW {
    public static void main(String[] args) {
        String regex = "Object-oriented programming";
        String s = "1Object-oriented programming is a programming language model organized around objects rather " +
                "than \"actions\" and data rather than logic. 2Object-oriented " +
                "programming blabla. 3Object-oriented programming bla. Object-oriented programming bla  ";
        StringBuilder stringBuilder = new StringBuilder(s );

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        int count1 = 0;
        while (matcher.find()) {
            count1++;
            if (count1%2==0) {
                stringBuilder.replace(matcher.start(), matcher.end(), "OOP");
                System.out.println(stringBuilder);
            }

        }
    }
}

