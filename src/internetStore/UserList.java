package internetStore;

import java.util.Scanner;

public class UserList {
    static boolean auntification = false;
    static int number;
    User[] users;

    public void add(User... users) {
        this.users = new User[users.length];
        System.arraycopy(users, 0, this.users, 0, users.length);
    }

    public void Auntification() {

        String login,password;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин");
        login=scanner.next();
        System.out.println("Введите пароль");
        password=scanner.next();
        first: {
            for (int i = 0; i < users.length; i++) {
                if (users[i].user.equals(login)&&users[i].password.equals(password)) {
                    System.out.println("Успешно залогинилися " + users[i].user);
                    auntification=true;
                    number=i;
                    break first;
                }
            }
            System.out.println("Аккаунт отсутсвует/Ошибка пароля");
        }
    }
}
