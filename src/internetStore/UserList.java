package internetStore;

import lesson17.WrongLoginException;
import lesson17.WrongPasswordException;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserList {
    Basket basket;
    private static boolean auntification = false;
    private static String login;
    private Map<String, User> usersMap = new HashMap<>();
    Scanner scanner = new Scanner(System.in);




    public void addUserMap(User user) {
        usersMap.put(user.user, user);

    }
    public void checkIn(){
        String login, password,confPassword;
        System.out.println("РЕГИСТРАЦИЯ!");
        System.out.println("Введите логин");
        login = scanner.nextLine();
        try {
            if (login.length() > 20) {
                throw new WrongLoginException("Login.length>20");
            }
            System.out.println("Введите пароль");
            password = scanner.nextLine();
            System.out.println("Повторите ввод");
            confPassword = scanner.nextLine();
            if (password.length() > 20 || !password.equals(confPassword)) {
                throw new WrongPasswordException("Wrong password");
            }else {
                usersMap.put(login,new User(login,password));
                this.login = login;
                auntification = true;
                System.out.println("Привет "+login );
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }


    }
    public void auntification() {
        String login, password;
        System.out.println("Введите логин");
        login = scanner.nextLine();

        if (usersMap.containsKey(login)) {
            System.out.println("Введите пароль");
            password = scanner.nextLine();
            if (usersMap.get(login).password.equals(password)) {
                System.out.println("Привет "+ login);
                this.login = login;
                auntification=true;
            } else {
                System.out.println("Ошибка ввода пароля!");
                auntification();
            }
        } else {
            System.out.println("Пользователь отсутсвует!");

            checkIn();
        }
        ;


/*        String login,password;
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
        }*/
    }

    public Map<String, User> getUsersMap() {
        return usersMap;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public static boolean isAuntification() {
        return auntification;
    }

    public static void setAuntification(boolean auntification) {
        UserList.auntification = auntification;
    }
}
