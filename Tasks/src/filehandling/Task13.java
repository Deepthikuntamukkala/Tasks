package filehandling;


import java.io.*;

public class Task13 {

    public static void main(String[] args) {
        try (
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line.replace("Java", "Python"));
                bw.newLine(); // More portable than "\n"
            }
            System.out.println("Replacement completed. Output written to output.txt.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: data.txt not found.");
        } catch (IOException e) {
            System.out.println("Error during file processing: " + e.getMessage());
        }
    }
}

