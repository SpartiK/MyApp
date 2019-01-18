package internetStore;

import java.util.Scanner;

public class User {
    Basket basket;
    String user,password;

    public User(Basket basket, String user, String password) {
        this.basket = basket;
        this.user = user;
        this.password = password;
    }
    public void inditification(Scanner scanner){
        if (scanner.next()==user){
            System.out.println("Привет "+ user);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "basket=" + basket +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
