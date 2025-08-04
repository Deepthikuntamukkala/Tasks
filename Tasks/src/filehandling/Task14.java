package filehandling;

import java.io.*;

public class Task14 {
    public static void main(String[] args) {
        try (
            BufferedWriter bw = new BufferedWriter(new FileWriter("merged.txt"));
            BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
            BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"))
        ) {
            String line;
            while ((line = br1.readLine()) != null)
                bw.write(line + System.lineSeparator());
            while ((line = br2.readLine()) != null)
                bw.write(line + System.lineSeparator());

            System.out.println("Files merged successfully into merged.txt.");
        } catch (FileNotFoundException e) {
            System.out.println("One of the input files was not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O error occurred: " + e.getMessage());
        }
    }
}
