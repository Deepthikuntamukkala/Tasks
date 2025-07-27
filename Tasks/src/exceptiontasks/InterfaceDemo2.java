package exceptiontasks;
interface Info {
   static void showDetails() {
       System.out.println("Static method in Interface");
   }
}

public class InterfaceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Info.showDetails();

	}

}
