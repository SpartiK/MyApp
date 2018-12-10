package OOP;

import java.sql.SQLOutput;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();

        phone1.number = "+380951586789";
        phone1.model = "Apple";
        phone1.weight = 175.4;


        System.out.println(phone1.number+" "+phone1.model+" "+phone1.weight);
    }
}
