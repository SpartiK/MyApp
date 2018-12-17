package oop;

import java.sql.SQLOutput;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone("+380951586666", "Motorolla", 250);
        Phone phone3 = new Phone();
        Phone phone4 = new Phone("+3809515865555", "Nokia");
        phone1.setNumber("+380951586789");
        phone1.setModel("Apple");
        phone1.setWeight(156.2);


        System.out.println(phone1.getNumber() + " " + phone1.getModel() + " " + phone1.getWeight());
        System.out.println(phone2.getNumber() + " " + phone2.getModel() + " " + phone2.getWeight());
        System.out.println(phone3.getNumber() + " " + phone3.getModel() + " " + phone3.getWeight());
        System.out.println(phone4.getNumber() + " " + phone4.getModel() + " " + phone4.getWeight());


        phone1.receiveCall("Вова");
        phone1.receiveCall("Вова", "+380990000762");


        System.out.println(phone1.getNumber());
        phone1.sendMessage("Нужна помощь", "911", "112", "102");
        System.out.println(Phone.getCount());

    }
}
