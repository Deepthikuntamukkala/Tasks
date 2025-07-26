@FunctionalInterface
interface MathOperation{
	int operate(int a,int b);
}
public class Program26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperation addition = (a,b)->a+b;
		MathOperation substraction = (a,b)->a-b;
		MathOperation multiplication=(a,b)->a*b;
		System.out.println("addition:"+addition.operate(4, 7));
		System.out.println("substraction:"+substraction.operate(9, 4));
		System.out.println("multiplication:"+multiplication.operate(3, 8));

	}

}
