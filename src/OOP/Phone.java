package OOP;

public class Phone {
    String number;
    String model;
    double weight;

    public Phone() {
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);

    }

    void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " - " + number);
        System.out.println("Текущий телефон " + this.number);

    }

    String getNumber() {
        return number;
    }


}
