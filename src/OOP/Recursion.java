package oop;

public class Recursion {
    public int recursion(int a, int b) {
        first:
        {
            if (a < b || a == b) {
                int print = 0;
                int q = 0;
                if (a == b) {
                    System.out.println(b);

                    break first;
                }
                System.out.println(a + " ");
                recursion(a + 1, b);
            } else {
                int print = 0;
                int q = 0;
                if (a == b) {
                    System.out.println(b);

                    break first;
                }
                System.out.println(a + " ");
                recursion(a - 1, b);
            }
        }
    return a;
}
    public static void main(String[] args) {
        Recursion recursion1 = new Recursion();
        recursion1.recursion(50, 5);
    }
}
