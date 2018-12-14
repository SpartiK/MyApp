package OOP;

public class Person {
    String FullName;
    int Age;

    public Person(String FullName, int Age) {
        this.FullName = FullName;
        this.Age = Age;

    }

    public Person() {
        this.FullName = "Незнакомец";
    }

    public void talk(String message) {
        System.out.println(FullName + "  говорит: " + message);

    }
    public  void move (){


    }
}
