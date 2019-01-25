package lesson10.hw.ex4;

public class Tie extends Clothes implements Man{
    String type ="Галстук";

    public Tie(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressUpMan() {
        System.out.printf("%7s размером %3s ценой %4s и цветом %5s (%s)%n ",type,size,price,color,size.getDescription());

    }

    @Override
    public String toString() {
        return "Tie{} " + super.toString();
    }
}
