abstract  class Appliance{
	abstract void turnOn();
}
interface Connectable{
	void connect();
}
class SmartTv extends Appliance implements Connectable{
	public void turnOn() {
		System.out.println("SmartTv is turned on");
	}
	public void connect() {
		System.out.println("SmartTv connected to WiFi");
	}
}
	
public class Program24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartTv stv=new SmartTv();
		stv.turnOn();
		stv.connect();
	
	}

}
