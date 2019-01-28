package lesson12.HM3;

public class StringHW {
    public static void main(String[] args) {

        String s = "Object-oriented programming is a programming language model organized around objects rather " +
                "than \"actions\" and data rather than logic. Object-oriented " +
                "programming blabla. Object-oriented programming bla.";
        StringBuilder stringBuilder = new StringBuilder(s);
        String s1 = "Object-oriented programming";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.regionMatches(i, s, 0, 5)) {
                count++;
                if (count % 2 == 0) {
                    stringBuilder.replace(i,i+s1.length(),"OOP");
                }

            }
        }
        System.out.println(stringBuilder);
    }
}
