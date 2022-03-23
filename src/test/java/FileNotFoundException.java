import org.junit.Test;

import java.io.File;
import java.util.Scanner;

public class FileNotFoundException {
    public static void main(String[] args) {
        readFile();
    }

    public static void readFile() {
        try{
            int temp = 5/0;
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        finally {
            System.out.println("New finally");
        }
    }
}
