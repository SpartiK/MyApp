package internetStore;

import java.util.Arrays;

public class Basket {
    Product[] products;

    public Basket(Product... product) {
        products = new Product[product.length];
        if (product.length >= 0) System.arraycopy(product, 0, products, 0, product.length);

    }
    public void basketAdd(Product... product) {
        products = new Product[product.length];
        System.arraycopy(product, 0, products, 0, product.length);

    }


    public void buy() {
        double count = 0;
        for (Product pr : products
        ) {
            count +=pr.price;
        }
        System.out.println("Для оплаты сумма =" + count);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "products=" + Arrays.toString(products) +
                '}';
    }
}