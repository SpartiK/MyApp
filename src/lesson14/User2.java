package lesson14;

import java.util.Objects;

public class User2 {
    private String login,password;


    public User2(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void createQuery(String name){
         class Query{
            public void printToLog(){
                System.out.printf("Пользователь с логином %s и паролем %s"
                        + " отправил запрос %S.%n" ,login,password,name);
            }
        }
        Query query = new Query();
        query.printToLog();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User2 user = (User2) o;
        return Objects.equals(login, user.login) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static void main(String[] args) {
        User2 user = new User2("login1","password1");
        user.createQuery("запрос");

    }
}
