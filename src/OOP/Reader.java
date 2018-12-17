package OOP;
import java.util.Arrays;

public class Reader {
    String Name, Surname, LibraryNumber, Faculty, Birthday, PhoneNumber;


    public Reader(String Name, String Surname, String LibraryNumber, String Faculty, String Birthday, String PhoneNumber) {
        this.Name = Name;
        this.Surname = Surname;
        this.LibraryNumber = LibraryNumber;
        this.Faculty = Faculty;
        this.Birthday = Birthday;
        this.PhoneNumber = PhoneNumber;
    }

    public void takeBook(String... books) {
        int a = 0;
for (String i : books){
    a++;
}
        System.out.println(Name+" "+Surname+" взял "+a+" книг");
    }

    public void takeBook(String Books) {

    }

    public void takeBook(Object... Books) {
        System.out.println(Name + " взял такие книги :");
        for (Object a : Books){
            System.out.println();
        }
    }

    public void returnBook(String name) {


    }

    public void returnBook(int quantity) {


    }

}
