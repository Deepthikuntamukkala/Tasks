abstract class Shape {
    abstract double area(); 
}

class Circle extends Shape {
    double rad;

    Circle(double r) {
        rad = r;
    }

    double area() {
        return 3.14 * rad * rad;
    }
}
class Rectangle extends Shape {
    double len, wid;

    Rectangle(double l, double w) {
        len = l;
        wid = w;
    }

    double area() {
        return len * wid;
    }
}
public class Program20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(5);
        Rectangle r = new Rectangle(8, 5);

        System.out.println("Area of Circle: " + c.area());
        System.out.println("Area of Rectangle: " + r.area());
    }
}

