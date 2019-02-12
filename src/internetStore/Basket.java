package internetStore;

import java.time.LocalDate;
import java.util.*;

public class Basket {
    LocalDate date;
List <Product> basketList = new ArrayList<>();

    public Basket() {
    }

    public Basket(List<Product> basketList) {
        this.basketList = basketList;
    }

    public void basketAdd(Product...products) {
        for (Product pr:products) {
            basketList.add(pr);
        }

    }


    public void buy() {
        this.date = LocalDate.now();
        double count = 0;
        System.out.println("Считаю сумму...");
        for (Product pr : basketList
        ) {
            if (pr != null) {
                count += pr.price;
            }
        }
        System.out.println("Для оплаты сумма = " + count + "  " + date);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "date=" + date +
                ", basketList=" + basketList +
                '}';
    }
}