import java.util.Scanner;

public class Program15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 10 nums:");
		for(int i=0;i<10;i++) {
			System.out.println(" ");
			arr[i]=s.nextInt();
		}
		int s1=0;
		int min=arr[0];
		int max=arr[0];
		for(int i=0; i<10; i++) {
			s1+=arr[i];
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		double avg =(double)s1/10;
		System.out.println("Avg:" +avg);
		System.out.println("Min: " + min);
        System.out.println("Max: " + max);

	}

}
