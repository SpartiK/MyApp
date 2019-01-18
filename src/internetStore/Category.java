package internetStore;

import java.util.Arrays;
import java.util.Scanner;

public class Category {
    String categoryName;
    Product[] products;

    public Category(String categoryName, Product... product) {
        products = new Product[product.length];
        if (product.length >= 0) System.arraycopy(product, 0, products, 0, product.length);

        this.categoryName = categoryName;

    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryName='" + categoryName + '\'' +
                ", products=" + Arrays.toString(products) +
                '}';
    }

    public static void main(String[] args) {

        Product Iphone8 = new Product("Iphone8", 650.50, 4.5);
        Product samsung8 = new Product("Samsung8", 500, 4.5);
        Product xiaomi5 = new Product("Xiaomi", 200, 4.9);

        Product lg = new Product("Iphone8", 650.50, 4.5);
        Product samsung = new Product("SamsungTV", 650.50, 4.5);
        Product kivi = new Product("Kivi", 400, 4.5);

        Category categorySmart = new Category("SamrtPhone", Iphone8, samsung8, xiaomi5);
        Category categoryTV = new Category("TV", lg, samsung, kivi);
        CategoryList categoryList = new CategoryList(categorySmart, categoryTV);

        Basket basket1 = new Basket();
        Basket basket2 = new Basket();
        Basket basket3 = new Basket();
        Basket basket4 = new Basket();

        User user1 = new User(basket1, "Nikita", "7364");
        User user2 = new User(basket2, "Vova", "1234");
        User user3 = new User(basket3, "Maks", "1111");
        User user4 = new User(basket4, "Dimva", "2222");

        UserList userList = new UserList();
        userList.add(user1, user2, user3, user4);

        Scanner sc = new Scanner(System.in);


        boolean exit = true;
        do {
            Function function = Function.valueOf(sc.next());
            switch (function) {
                case AUNTIFICATION:
                    System.out.println("Autification");
                    userList.Auntification();
                    break;
                case CATEGORYS:
                    categoryList.categoryName();
                    break;
                case PRODUCTS:
                    System.out.println("Для выбора категории \"Смартфоны\" - 1");
                    System.out.println("Для выбора категории \"ТВ\" - 2");
                    switch (sc.nextInt()) {
                        case 1:
                            System.out.println(categorySmart);
                            break;
                        case 2:
                            System.out.println(categoryTV);
                            break;
                    }
                    break;
                case ADDBASKET: // Не реализовано!!
                    System.out.println("Выбор товара..");
                    switch (sc.nextInt()) {
                        case 1:
                            userList.users[UserList.number].basket.basketAdd(samsung, kivi, xiaomi5);
                            break;
                        case 2:
                            userList.users[userList.number].basket.basketAdd(samsung8, lg, xiaomi5);

                            break;
                    }

                    break;
                case BUY:
                    exit = true;
                    if (UserList.auntification) {
                        userList.users[userList.number].basket.buy();
                        userList.users[userList.number].basket.toString();
                        break;
                    } else System.out.println("Войдите в аккаунт");
                    break;
                default:// Не работает!
                    System.out.println("Ошибка!");
                    break;
            }
        } while (exit);

    }
}
