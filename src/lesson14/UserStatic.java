package lesson14;

import java.util.Objects;

public class UserStatic {
    private static String login,password;

    public static class Query{
        public void printToLog(){
            System.out.printf("Пользователь с логином %s и паролем %s"
                    + " отправил запрос.%n" ,login,password);
        }
    }
    public UserStatic(String login, String password) {
       UserStatic.login = login;
        UserStatic.password = password;
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
    public static void  createQuery(){
        Query query = new Query();
        query.printToLog();
    }


    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static void main(String[] args) {
        UserStatic user1 = new UserStatic("login1","password1");
        UserStatic user2 = new UserStatic("login2","password2");


        Query query1 = new Query();


        //User.Query query2 = new User("login2","password2").new Query();
        //query2.printToLog();
    }
}

