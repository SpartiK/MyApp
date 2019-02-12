package lesson17;

import java.net.PasswordAuthentication;
import java.util.Set;

public class MyExceptionsDemo {
    public static void main(String[] args) {

        System.out.println(verify("Nikita", "2211", "2211"));
        System.out.println(verify("Nikita123456789012345", "2211", "2211"));
        System.out.println(verify("Nikita", "22111", "2211"));


    }

    public static boolean verify(String login, String password, String confPassword) {
        try {
            if (login.length() > 20) {
                throw new WrongLoginException("Login.length>20");
            }
            if (password.length() > 20 || !password.equals(confPassword)) {
                throw new WrongPasswordException("Wrong password");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            System.out.printf("Login %s, password %s, confirmPassword %s%n", login, password, confPassword);
        }
        return true;
    }
}
