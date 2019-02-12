package internetStore;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class User {
    Basket basket;
    String user,password;
    public User( String user, String password) {
        this.basket = new Basket();
        this.user = user;
        this.password = password;

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
