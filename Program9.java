import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //menu driven calculator
		Scanner sc=new Scanner(System.in);
		int choice;
		double num1,num2,result;
		
		do {
			System.out.println("addition");
			System.out.println("subtraction");
		    System.out.println("multiplication");
			System.out.println("division");
			System.out.println("Exit");
			System.out.println("enter your choice");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("enter two numbers");
				num1=sc.nextDouble();
				num2=sc.nextDouble();
				result=num1+num2;
				System.out.println("result is " +result);
				break;
				
			case 2:
				System.out.println("enter two numbers");
				num1=sc.nextDouble();
				num2=sc.nextDouble();
				result=num1-num2;
				System.out.println("result is " +result);
				break;
				
			case 3:
				System.out.println("enter two numbers");
				num1=sc.nextDouble();
				num2=sc.nextDouble();
				result=num1*num2;
				System.out.println("result is " +result);
				break;
				
			case 4:
				System.out.println("enter two numbers");
				num1=sc.nextDouble();
				num2=sc.nextDouble();
				result=num1/num2;
				System.out.println("result is " +result);
				break;
			
			case 5:
				System.out.println("exit calculation");
				break;
				
			default:
				System.out.println("invaid choice");
				break;
				
			}
	       //System.out.println();
	    }while(choice!=5);
	    	
		 sc.close();
	}

}
