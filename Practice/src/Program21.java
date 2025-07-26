class Vehicle{
	int speed;
	String brand;
	
	void showDetails() {
		System.out.println("speed: " + speed + "km/h");
		System.out.println("brand: "+brand);
	}
}
class Bike extends Vehicle{
	int color;
}
class Car extends Vehicle{
	int color;
}
public class Program21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike = new Bike();
		bike.speed=100;
		bike.brand="Honda";
		bike.showDetails();
		
		Car car = new Car();
		car.speed=150;
		car.brand="maruti";
		car.showDetails();

	}

}
