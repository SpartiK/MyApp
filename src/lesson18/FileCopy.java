package lesson18;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileCopy {
    public static void main(String[] args) {
        //int size = 0;
        File file = new File("a.txt");
        try (FileWriter fw = new FileWriter("copied_a.txt");
             FileReader fr = new FileReader("a.txt")) {
            char[] symbols = new char[50];
            int size;
            size = fr.read(symbols);
            System.out.println(size);
            System.out.println(Arrays.toString(symbols));
            fw.write(symbols);



        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}


