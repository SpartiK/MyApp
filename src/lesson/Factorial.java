package lesson;

public class Factorial {

    public static void main(String[] args) {
factorial();




    }

    public static void factorial(){
        int f = (int)(Math.random()*5);
        int fac=1;
        for (int i=1; i<=f;i++){
            fac*=i;

        }
        System.out.println("факториал числа " + f + "=" + fac);

    }


}
