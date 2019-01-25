package lesson12;

public class HomeWork {
    public static void main(String[] args) {
        String str = "\"Object-oriented programming is a programming language model organized around objects rather than \"actions\" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.";
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(str.endsWith("lol"));
        System.out.println(str.indexOf("Object-oriented programming"));

    }
}
