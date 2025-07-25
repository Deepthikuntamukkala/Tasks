import java.util.Scanner;

public class Program14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a positive number (-1 to end): ");
            number = s.nextInt();

            if (number >= 0) {
                System.out.println("You entered: " + number);
            } else if (number != -1) {
                System.out.println("Enter a positive number.");
            }

        } while (number != -1);

        System.out.println("Program ended.");
       
    }
}



		        