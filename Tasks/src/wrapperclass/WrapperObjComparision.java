package wrapperclass;

public class WrapperObjComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 80;             
        Integer b = 80; 
        
        Integer c = new Integer(80);
        Integer d = new Integer(80);
        
        System.out.println("a == b : " + (a == b));        
        System.out.println("a.equals(b) : " + a.equals(b));

        System.out.println("c == d : " + (c == d));        
        System.out.println("c.equals(d) : " + c.equals(d)); 

        System.out.println("a == c : " + (a == c));         
        System.out.println("a.equals(c) : " + a.equals(c));


	}

}
