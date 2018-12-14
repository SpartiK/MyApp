package OOP;

import java.sql.SQLOutput;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone("+380951586666", "Motorolla", 250);
        Phone phone3 = new Phone();
        Phone phone4 = new Phone("+3809515865555", "Nokia");
        phone1.number = "+380951586789";
        phone1.model = "Apple";
        phone1.weight = 175.4;


        System.out.println(phone1.number + " " + phone1.model + " " + phone1.weight);
        System.out.println(phone2.number + " " + phone2.model + " " + phone2.weight);
        System.out.println(phone3.number + " " + phone3.model + " " + phone3.weight);
        System.out.println(phone4.number + " " + phone4.model + " " + phone4.weight);


        phone1.receiveCall("Вова");
        phone1.receiveCall("Вова", "+380990000762");


        System.out.println(phone1.getNumber());


    }
}
