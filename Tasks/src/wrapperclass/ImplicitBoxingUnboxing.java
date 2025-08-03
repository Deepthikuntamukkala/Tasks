package wrapperclass;
import java.util.*;

public class ImplicitBoxingUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Double> num = new ArrayList<>();
		 //implicit boxing
		 num.add(3.8);
	     num.add(16.3);
	     num.add(23.4);
	     
	     //implicit unboxing
	     double sum = 0;
	     for (int i = 0; i < num.size(); i++) {
	         sum += num.get(i);
         }
	     double avg = sum / num.size();
	     System.out.println("Numbers: " + num);
	     System.out.println("Sum: " + sum);
	     System.out.println("Average: " + avg);
	}
}
