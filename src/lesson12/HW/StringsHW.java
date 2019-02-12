package lesson12.HM3;

import java.util.Scanner;

public class StringsHW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        checkMiddleChars(sc);


    }

    private static void checkMiddleChars(Scanner sc) {
        if (sc.hasNext()){
            String s = sc.next();
            if (s.length()%2==0){
            System.out.print(s.charAt(s.length()/2-1));
            System.out.println(s.charAt(s.length()/2));
            }else {
                System.out.println("Нечет");
            }
        }
    }
}
