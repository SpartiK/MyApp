package lesson11;

public enum Season {
    WINTER(-5.2),
    SPRING(15),
    SUMMER(25){
        public String getDescription(){
            return "Теплое время года";
        }
    },
    AUTUMN(7.5);
    private double tmp;


    Season(double tmp) {
        this.tmp = tmp;
    }
    Season() {
    }

    public double getTmp() {
        return tmp;
    }
    public String getDescription(){
        return "Холодное время года";
    }
}
