package OOP;

import java.util.Arrays;

public class LibraryDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Мастер и Маргаритта", "Булгаков");
        Book book2 = new Book("Анна Каренина", "Толстой");
        Book book3 = new Book("Идиот", "Достоевский");


Reader reader [] = new  Reader[5];
reader [0] = new Reader("Никита","Dekar","255","AKIT","21.04.1997","0951586789");
reader [1] = new Reader("Никита","Dekar","255","AKIT","21.04.1997","0951586789");
reader [2] = new Reader("Никита","Dekar","255","AKIT","21.04.1997","0951586789");
reader[0].takeBook("Ьулгаков", "Достаевский");
reader[1].takeBook(book1,book2,book3);
book1.print();
    }


}
