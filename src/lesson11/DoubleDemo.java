package lesson11;

public class DoubleDemo {
    public static void main(String[] args) {
        Double double1 = new Double(25.5);
        Double double2 = new Double("22.5");
        System.out.println(double1+" "+double2);
        Double double3 = Double.valueOf(25.5);
        Double double4 = Double.valueOf("25.5");
        System.out.println(double3+" "+double4);
        double d = 21.5;
        System.out.println(d);
        Double doub = 115.5;

        System.out.println( doub.intValue());
        System.out.println( doub.byteValue());
        System.out.println( doub.floatValue());
        System.out.println( doub.intValue());
        System.out.println( doub.intValue());
        System.out.println( doub.intValue());
        System.out.println( doub.intValue());
    }
}
