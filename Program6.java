import java.util.Scanner;
public class Program6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string:");
		String str = sc.nextLine();
		String str1 = " ";
		for (int i = str.length()-1; i >= 0; i--) {
			str1+= str.charAt(i);
			System.out.println("reversed string:" +str1);
			
		}
		}

}
