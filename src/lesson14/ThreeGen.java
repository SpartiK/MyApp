package lesson14;

import animal.Animal;
import animal.Dog;
import store.Box;

import java.io.Serializable;

public class ThreeGen<T extends Comparable, V extends Animal & Serializable,K extends Number> {
    private T ob1;
    private V ob2;
    private K ob3;

    ThreeGen(T o1, V o2,K o3) {
        ob1 = o1;
        ob2 = o2;
        ob3 = o3;
    }

    void showTypes() {
        System.out.println("Type of T is "
                + ob1.getClass().getName());

        System.out.println("Type of V is "
                + ob2.getClass().getName());

    System.out.println("Type of K is "
                + ob3.getClass().getName());
    }
    T getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }

    K getOb3(){return  ob3;}

    public static void main(String[] args) {
        ThreeGen<String, Dog,Integer> tgObj = new ThreeGen<>("str", new Dog("Meat","Boan"),34);
        tgObj.showTypes();
//        int v = tgObj.getOb1();
//        System.out.println("value: " + v);
//
//        String str = tgObj.getOb2();
//        System.out.println("value: " + str);

    }
}
