package lesson10.hw.ex4;

public class Skirt extends Clothes implements Woman{
    String type ="Юбка";

    public Skirt(Size size, double price, String color) {
        super(size, price, color);

    }

    @Override
    public void dressUpWoman() {
        System.out.printf("%7s размером %3s ценой %4s и цветом %5s (%s)%n ",type,size,price,color,size.getDescription());

    }


    @Override
    public String toString() {
        return "Skirt{} " + super.toString();
    }
}
