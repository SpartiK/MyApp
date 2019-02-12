package internetStore;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StoreDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product Iphone8 = new Product("Iphone8", 650.50, 4.5);
        Product samsung8 = new Product("Samsung8", 500, 4.5);
        Product xiaomi5 = new Product("Xiaomi", 200, 4.9);

        Product lg = new Product("LG", 650.50, 4.5);
        Product samsung = new Product("SamsungTV", 650.50, 4.5);
        Product kivi = new Product("Kivi", 400, 4.5);


        Category categorySmart = new Category("SmartPhone", Iphone8, samsung8, xiaomi5);
        Category categoryTV = new Category("TV", lg, samsung, kivi);
        CategoryList categoryList = new CategoryList(categorySmart, categoryTV);


        User user1 = new User("Nikita", "7364");
        User user2 = new User( "Vova", "1234");
        User user3 = new User("Maks", "1111");
        User user4 = new User( "Dimva", "2222");
        UserList userList = new UserList();
        userList.addUserMap(user1);
        userList.addUserMap(user2);
        userList.addUserMap(user3);
        userList.addUserMap(user4);
        boolean exit = true;
        do {
            System.out.println("Авторизация  - AUTHENTIFICATION");
            System.out.println("Категории - CATEGORIES");
            System.out.println("Товары - PRODUCTS");
            System.out.println("Добавление в корзину - ADDBASKET");
            System.out.println("Покупка - BUY");
            try {
                Function function = Function.valueOf(sc.next());

                switch (function) {
                    case AUTHENTIFICATION:
                        System.out.println("Autification");
                        userList.auntification();
                        break;
                    case CATEGORIES:
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
                    case ADDBASKET:
                        boolean f = true;
                        String sProd;
                        while (f) {
                            System.out.println("Для выхода - \"f\"");
                            System.out.println("Введите название товара");
                            sProd = sc.next();
                            if (sProd.equals("f")) {
                                f = false;
                            }
                            int count = 0;
                            for (Product pr : ProductList.products
                            ) {
                                if (pr.name.equals(sProd)) {
                                    count++;
                                    userList.getUsersMap().get(userList.getLogin()).basket.basketAdd(pr);
                                    System.out.println("Успешно добавлено " + pr.name);
                                }
                            }
                            if (count == 0 && !sProd.equals("f")) {
                                count = 0;
                                System.out.println("Ошибка в названии товара!");
                            }
                        }
                        break;
                    case BUY:
                        //exit = false;
                        if (UserList.isAuntification()) {
                            userList.getUsersMap().get(userList.getLogin()).basket.buy();
                            userList.getUsersMap().get(userList.getLogin()).basket.toString();
                            userList.getUsersMap().get(userList.getLogin()).basket.basketList.clear();
                            break;
                        } else System.out.println("Войдите в аккаунт");
                        break;
                }
            } catch (
                    IllegalArgumentException n) {
                System.out.println("Повторите ввод еще раз");
            }
        } while (exit);
    }
}
