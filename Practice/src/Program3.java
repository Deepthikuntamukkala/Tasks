import java.util.*;
public class Program3 {
	public static void main(String[] args) {
		int n1=10;
		int n2=45;
		double d = 2d;
		float f = 2.4f;
		char c = 'D';
		byte b = 5;
		long l = 50000;
		short s = 45; 
		boolean bl = false;
		int sum=n1+n2;
		System.out.println("addition:" +sum);
		System.out.println("the value of d" + d);
		System.out.println("the value of float" + f);
		System.out.println("the character is" + c );
		System.out.println(+b);
		System.out.println(+l);
		System.out.println(+s);
		System.out.println("the boolean value " + bl);
		if(n1>n2) {
			System.out.println("n1 is bigger");
		}
		else {
			System.out.println("n2 is bigger");
		}
	}

}
