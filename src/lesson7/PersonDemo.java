package lesson7;

public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person("Никита Декар", 21);
        Person person2 = new Person();

        person1.talk(" Привет всем!");
        person2.talk(" Я незнакомец!");
        person1.toString();
        System.out.println(person1);

    }

}
