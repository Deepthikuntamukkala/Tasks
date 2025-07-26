import java.util.Scanner;

public class Program16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int[][] matrix = new int[3][3];
	    Scanner s= new Scanner(System.in);
	    
	    System.out.println("Enter elements of 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Element at (" + i + "," + j + "): ");
                matrix[i][j] = s.nextInt();
            }
        }
        System.out.println("\nOriginal Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nTranspose of the Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

	}

}
