package lesson10;

import java.util.Objects;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract void drow();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Objects.equals(color, shape.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Red",0,0,10,5);
        Circle circle1 = new Circle("Green",5,10,7);
        Circle circle2 = new Circle("Yellow",12,10,11);
        Circle circle3;
        circle3=circle1;
        Shape[] shapes = new Shape[]{rectangle,circle1,circle2};
        for (Shape sh:shapes){
            sh.drow();
        }
        System.out.println(circle1.equals(circle2));
        System.out.println(circle1.equals(circle3));
        System.out.println(circle1);
        System.out.println(circle1.square());
        System.out.println(circle1.lenth());
    }
}
