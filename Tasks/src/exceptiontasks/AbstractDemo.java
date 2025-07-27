package exceptiontasks;
abstract class Shape{
	abstract double area();
}
class Circle extends Shape{
	double radius;
	
	Circle(double radius){
		this.radius=radius;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}
	
}
class Rectangle extends Shape {
    double length, breadth;
    
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    @Override
	double area() {
		// TODO Auto-generated method stub
		return length*breadth;
	}

}


public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Circle(4);
		Shape s2 = new Rectangle(6,3);
		
		System.out.println("Circle area:"+s1.area());
		System.out.println("Rectangle area"+s2.area());

	}

}
