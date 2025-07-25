
public class Program13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0, a=2;
		while (c<10) {
	    boolean isPrime = true;
	    
		for(int i=2;i<=a/2;i++) {
			if(a%i==0) {
				isPrime=false;
				break;
				
			}
		}
		if(isPrime) {
			System.out.println(a+"");
			c++;
		}
		a++;
		
		}
	}

}
