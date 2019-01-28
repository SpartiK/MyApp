package internetStore;

import java.util.Arrays;
import java.util.Scanner;

public class Basket {
     Product[] products;

    public Basket(Product... product) {
        products = new Product[product.length];
        if (product.length >= 0) System.arraycopy(product, 0, products, 0, product.length);

    }
    public void basketAdd(Product[]pr) {
        products = pr;

    }


    public void buy() {
        double count = 0;
        System.out.println("Считаю сумму...");
        for (Product pr : products
        ) {
            if (pr!=null){
            count +=pr.price;
        }}
        System.out.println("Для оплаты сумма =" + count);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "products=" + Arrays.toString(products) +
                '}';
    }
}