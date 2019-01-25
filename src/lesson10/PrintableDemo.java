package lesson10;

public class PrintableDemo {
    public static void main(String[] args) {
        Printable book = new Book("Book1");
        Printable magazine1 = new Magazine("Magazine1");
        Magazine magazine2 = new Magazine("Magazine2");


//        Magazine.printMagazines(printables);
//        Book.printBook(printables);

        Printable newspaper = () ->
            System.out.println("Print newspaper");

            Printable[] printables = {book, magazine1, magazine2, newspaper};
            for (Printable pr : printables) {
                pr.print();
            }


        }
    }

