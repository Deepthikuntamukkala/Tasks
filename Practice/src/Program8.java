import java.util.Scanner;
public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,b,res;
	    char op;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter first num");
	    a=sc.nextFloat();
	    System.out.println("enter second num");
	    b=sc.nextFloat();
	    System.out.println("enter the operator");
	    op=sc.next().charAt(0);
	    
	    res=a;
	    
	    switch(op) {
	    case '+':
	    	res+=b;
	    	break;
	    case '-':
	    	res-=b;
	    	break;
	    case '*':
	    	res*=b;
	    	break;
	    case '/':
	    	if(b!=0) {
	    		res/=b;
	    	}else {
	    		System.out.println("Error enter valid number");
	    	}
	    	default:
	    		System.out.println("enter valid operator");
	    		
	    }
	    System.out.println("Result:" +res);
	}

}
