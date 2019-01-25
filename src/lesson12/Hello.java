package lesson12;

public class Hello {

    public static Boolean endWith(String str) {
        return str.endsWith("!!!");
    }

    public static Boolean startWith(String str) {
        return str.startsWith("I like");
    }
    public static char lastChar (String str){
        return str.charAt(str.length()-1);
    }


    public static void main(String[] args) {
//        Hello hello1 = new Hello();
        System.out.println(Hello.endWith("!!!"));
        System.out.println(Hello.startWith("I like"));
        System.out.println(Hello.lastChar("Hello"));
        System.out.println("I like java".indexOf("java"));
        System.out.println("I like java".replace('a','o'));
        System.out.println("I like java".toUpperCase());
        System.out.println("I like java".toLowerCase());
        int k ="I like java".indexOf("java");
        System.out.println("I like java".substring(k));

    }

}
