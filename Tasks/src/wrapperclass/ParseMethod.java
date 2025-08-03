package wrapperclass;

public class ParseMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String si = "123";
        String sd = "45.67";
        String sb = "true";
        
        int i1 = Integer.parseInt(si);
        double d1 = Double.parseDouble(sd);
        boolean b1 = Boolean.parseBoolean(sb);
        
        System.out.println("Integer value: " + si + " (Type: int)");
        System.out.println("Double value: " + sd + " (Type: double)");
        System.out.println("Boolean value: " + sb+ " (Type: boolean)");



	}

}
