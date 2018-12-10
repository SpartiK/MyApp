package lesson;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Summa {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = getValue(sc);
        int a2 = getValue(sc);
        int sum = a1 +a2;
        System.out.println("Cумма = "+ sum);


    }

   public static int getValue(Scanner sc) {
int a = 0;
if (sc.hasNextInt()){
    a = sc.nextInt();


}
else System.out.println("Ошибка!");




return a;

}

}