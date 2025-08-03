package wrapperclass;

public class PrimitiveToWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Primitives declaration
		int i = 38;
        double d = 64.86;
        char ch = 'D';
        
        //Primitive to Wrapper conversion
        Integer i1 = Integer.valueOf(i);
        Double d1 = Double.valueOf(d);
        Character ch1 = Character.valueOf(ch);
        
        //Wrapper to Primitive conversion
        Integer i2 = i1.intValue();
        Double d2 = d1.doubleValue();
        Character ch2 = ch1.charValue();
        
        System.out.println("Primitive int:"+i);
        System.out.println("Wrapped int:" +i1);
        System.out.println("unboxed int:" +i2);

        System.out.println("Primitive double:"+d);
        System.out.println("Wrapped double:" +d1);
        System.out.println("unboxed double:" +d2);
        
        System.out.println("Primitive char:"+ch);
        System.out.println("Wrapped char:" +ch1);
        System.out.println("unboxed char:" +ch2);



	}

}
