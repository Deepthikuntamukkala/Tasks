class Calculator{
	int add(int a,int b) {
		return a+b;
	}
	double add(double a,double b) {
		return a+b;
	}
	String add(String a, String b) {
		return a+b;
	}
}
public class Program22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		System.out.println("sum of int:" +cal.add(7,4));
		System.out.println("sum of double:" +cal.add(4.8,6.7));
		System.out.println("string concat:" +cal.add("welcome","back"));

	}

}
