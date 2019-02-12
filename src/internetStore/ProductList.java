package internetStore;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
    static List<Product> products = new ArrayList<>();

    public ProductList(Product... products) {
        for (Product pr:products) {
            this.products.add(pr);

        }

    }
    public void addProducts(Product[] products){
        for (Product pr:products) {
            this.products.add(pr);
        }
    }
}
