package lesson15;


import java.util.function.Function;

public class FucntionDemo {
    public static void main(String[] args) {
        Function<Integer,String> function1 = i-> i>0? "Положительное число":i<0?"Отрицательное число": "Ноль";
        System.out.println(function1.apply(9));
        System.out.println(function1.apply(-9));
        System.out.println(function1.apply(0));




    }
}
