package internetStore;

import java.util.Arrays;
import java.util.Scanner;

public class Category {
    private String categoryName;
    private Product[] products;

    public Category(String categoryName, Product... product) {
        products = new Product[product.length];
        if (product.length >= 0) System.arraycopy(product, 0, products, 0, product.length);
        this.categoryName = categoryName;
        for(Product pr:product){
            ProductList.products.add(pr);
        }
    }

    public String getCategoryName() {
        return categoryName;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryName='" + categoryName + '\'' +
                ", products=" + Arrays.toString(products) +
                '}';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


    }
}
