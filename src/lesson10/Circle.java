package lesson10;

import java.util.Objects;

public class Circle extends Shape {
    private int x,y,r;
    static double PI = 3.14;
    public Circle(String color, int x, int y, int r) {
        super(color);
        this.x = x;
        this.y = y;
        this.r = r;
    }



    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public  double square (){
        return r*r*PI;
    }
    public double lenth (){
        return  2*r*PI;
    }
    @Override
    public void drow() {
        System.out.println("Drow circle with coordinates "+ x+" "+y+" with radius "+r+" with color "+ getColor());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return x == circle.x &&
                y == circle.y &&
                r == circle.r;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), x, y, r);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", r=" + r +
                "} " + super.toString();
    }
}
