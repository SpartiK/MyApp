package lesson10.hw.ex4;

public enum Size {
    XXS(32) {
        String getDescription() {
            return "Детский размер";

        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);
    private int euroSize;

    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    String getDescription() {
        return "Взрослый размер";
    }
}
