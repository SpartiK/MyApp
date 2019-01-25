package lesson10.hw.ex4;

import lesson10.Printable;

public class Atelier {


    static public void dressUpMan(Clothes[] clothes) {
        System.out.println("Женская одежда:");
        for (Clothes cl : clothes) {
cl.dressUpMan();
        }


    }

    static public void dressUpWoman(Clothes[] clothes) {
        System.out.println("Мужская одежда:");

        for (Clothes cl : clothes) {
            cl.dressUpWoman();
        }
    }


    public static void main(String[] args) {
//        Man tshortM = new Tshort(Size.XXS, 25.5, "Red");
//        Man pantsM = new Pants(Size.S, 40, "Brown");
//        Man tieM = new Tie(Size.XS, 5, "Black");
//
//        Woman tshortW = new Tshort(Size.XXS, 25.5, "Red");
//        Woman pantsW = new Pants(Size.S, 40, "Brown");
//        Woman skirtW = new Skirt(Size.XS, 5, "Black");

        Tshort tshort = new Tshort(Size.XXS, 25.5, "Red");
        Pants pants = new Pants(Size.S, 40, "Brown");
        Skirt skirt = new Skirt(Size.M, 15, "Green");
        Tie tie = new Tie(Size.XS, 5, "Black");

        Clothes[] clothes = new Clothes[4];
        clothes[0] = tshort;
        clothes[1] = pants;
        clothes[2] = skirt;
        clothes[3] = tie;
        dressUpMan(clothes);
        dressUpWoman(clothes);
        //dressUpWoman(clothes);



    }
}
