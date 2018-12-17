package OOP;

import java.util.Arrays;

public class Book {
    public String Name;
    public String Author;

    public Book(String name, String author) {
        Name = name;
        Author = author;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }
    public void print (){
        System.out.println(Name + " "+ Author);
    }
}
