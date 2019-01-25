package lesson10.hw.ex4;

public class Tshort extends Clothes implements Woman,Man {
    String type ="Футболка";

    public Tshort(Size size, double price, String color) {
        super(size, price, color);


    }

    @Override
    public void dressUpMan() {
        System.out.printf("%7s размером %3s ценой %4s и цветом %5s (%s)%n ",type,size,price,color,size.getDescription());
    }

    @Override
    public void dressUpWoman() {
        System.out.printf("%7s размером %3s ценой %4s и цветом %5s (%s)%n ",type,size,price,color,size.getDescription());

    }

    @Override
    public String toString() {
        return "Tshort{" +
                "size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }
}
