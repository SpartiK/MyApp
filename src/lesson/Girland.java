package lesson;
import java.util.Scanner;

public class Girland {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 1 до 3-х для выбора режима");
        System.out.println("1 - проверка первой лампочки на мигание");
        System.out.println("2 - мигание");
        System.out.println("3 - бегущая строка");

        if (sc.hasNextInt()){
            int number = sc.nextInt();
            switch (number){
                case 1: checkGirl();
                break;
                case 2 : miganie();
                break;
                case 3 : stroka();
                break;
                default: System.out.println("Введите число 1-3");

            }

        }else System.out.println("Введите число 1-3");





    }
        public static void checkGirl() {
            //Scanner sc = new Scanner(System.in);
            int girland = (int)(Math.random()*1000);
            int b = 1;
            int check = girland & 1;
            if (check == 1) {
                System.out.println("Включена");
                System.out.println(Integer.toBinaryString(girland));

            } else System.out.println("Выключен - " +Integer.toBinaryString(girland));


        }



    public static void miganie( ) {
        int girland = (int)(Math.random()*1000);
        int girland2=~girland;
        for (int i=0;i<20;i++) {
            System.out.println(Integer.toBinaryString(girland));
            System.out.println(Integer.toBinaryString(girland2));
        }


    }
    public static void stroka() {
        int girland = (int)(Math.random()*1000+500);
    for (int i=0;i<20;i++) {
        girland = girland >> 1;
        System.out.println(Integer.toBinaryString(girland));
    }



    }











}