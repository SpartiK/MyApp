package lesson7;

public class Person {
    String FullName;
    int Age;

    protected  Person(String fullName, int age) {
        FullName = fullName;
        Age = age;
    }

    public Person() {
        this.FullName = "Незнакомец";
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void talk(String message) {
        System.out.println(FullName + "  говорит: " + message);

    }

    @Override
    public String toString() {
        return "'" + FullName + '\'' +
                ", Возраст = " + Age;
    }

    public void move() {


    }
}
