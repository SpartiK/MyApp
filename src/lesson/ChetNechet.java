package lesson;
import java.util.Scanner;
public class ChetNechet {

    public static void makeChet(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        if (sc.hasNextDouble()) {
            double K = sc.nextDouble();
            if (K % 2 == 0) {
                System.out.println("Четное");
            } else System.out.println("Нечет");
        }
        else System.out.println(" Нет числ");
    }
    public static void main(String[] args) {
       makeChet();
        /*double d;
        if (sc.hasNext()) {
            d = sc.nextDouble();
        }
        else System.out.println("22");*/




    }

    }