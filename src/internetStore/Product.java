package internetStore;

public class Product {
    String name;
    double price,reiting;
    public Product(String name, double price, double reiting) {
        this.name = name;
        this.price = price;
        this.reiting = reiting;


    }
    @Override
    public String toString() {
        return String.valueOf(System.out.printf("%12s цена %5.2f рейтинг %.2f%n",name,price,reiting));

    }
}
