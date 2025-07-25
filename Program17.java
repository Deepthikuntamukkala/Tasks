class Book {
    String title;
    String author;
    double price;
    
    void displayDetails() {
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Price : ₹" + price);
    }
}
public class Program17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book();
        Book b2 = new Book();
        
        b1.title = "JAVA Programming Book";
        b1.author = "P. Rizwan Ahmed";
        b1.price = 140.0;
        
        b2.title = "The Religion of Java";
        b2.author = "Clifford Geertz";
        b2.price = 250.0;

     
        b1.displayDetails();
        b2.displayDetails();

	}

}
