package filehandling;

import java.io.*;
public class Task1 {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("info.txt", true));
            writer.write("Java I/O is powerful!\n");
            writer.write("Learn Java step-by-step\n");
            writer.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
     }
}