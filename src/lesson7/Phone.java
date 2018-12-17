package lesson7;

public class Phone {
    private String number, model;
    private double weight;
    private static int count;
    public Phone() {
        count++;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        count++;
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        count++;
    }
    static int getCount(){
        return count;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number){
        this.number= number;
    }
    public double getWeight (){
        return weight;
    }
    public void setWeight (double weight){
        this.weight=weight;
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);

    }

    void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " - " + number);
        System.out.println("Текущий телефон " + this.number);

    }
    void sendMessage (String message,String... numbers){
        System.out.println(this.number + " отправляет сообщение: \"" + message + "\" номерам:");
        for(String a : numbers){
            System.out.println(a+ " ");
        }

    }




}
