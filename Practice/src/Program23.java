class Animal{
	void sound() {
		System.out.println("Sounds of animals");
	}
}
class Dog extends Animal{
	void sound() {
		System.out.println("Dog barks");
	}
}
class Cat extends Animal{
	 void sound() {
		 System.out.println("cat meows");
	 }
}
class Cow extends Animal{
	void sound() {
		System.out.println("cow moos");
	}
}
public class Program23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Dog();
		Animal a1 = new Cat();
		Animal a2 = new Cow();
		a.sound();
		a1.sound();
		a2.sound();

	}

}
