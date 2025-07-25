
public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		System.out.println("original int value" +x);
		System.out.println("post increment" +(x++));//first print x after increment
		System.out.println("pre increment:" +(x++));//first increment after print x
		
		//bitwise shift operators
		System.out.println("bitwise left shift" +(x << 1));
		System.out.println("bitwise right shift" +(x >> 1));
		
		//logical vs bitwise AND
		boolean a=true;
		boolean b=false;
		System.out.println("logical and (a&&b):" +(a && b));//both values should be true o/p will be false
		System.out.println("bitwise AND(a&b):" +(a & b));//false
		
		//with integers
		int c=6;
		int d=7;
		System.out.println("bitwise AND (m&n):" +(c & d));
		System.out.println("bitwiae OR(m|n):" +(c|d));

	}

}
