import java.util.*;

public class ECommerceApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get Customer details
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Customer Email: ");
        String email = sc.nextLine();

        Customer customer = new Customer(name, email);

        // Step 2: Product Selection
        List<Product> products = new ArrayList<>();

        System.out.print("How many products to add to order? ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("\nChoose product type:");
            System.out.println("1. Electronics");
            System.out.println("2. Clothing");
            int choice = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Product ID: ");
            String id = sc.nextLine();

            System.out.print("Enter Product Name: ");
            String prodName = sc.nextLine();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter Brand: ");
                String brand = sc.nextLine();
                System.out.print("Enter Warranty (in months): ");
                int warranty = sc.nextInt();
                sc.nextLine();
                products.add(new Electronics(id, prodName, price, brand, warranty));
            } else if (choice == 2) {
                System.out.print("Enter Size: ");
                String size = sc.nextLine();
                System.out.print("Enter Fabric: ");
                String fabric = sc.nextLine();
                products.add(new Clothing(id, prodName, price, size, fabric));
            } else {
                System.out.println("Invalid product type. Skipping...");
            }
        }

        // Step 3: Choose Payment Method
        System.out.println("\nChoose Payment Method:");
        System.out.println("1. UPI");
        System.out.println("2. Credit Card");

        int paymentChoice = sc.nextInt();
        sc.nextLine();

        Payment payment = null;

        if (paymentChoice == 1) {
            System.out.print("Enter UPI ID: ");
            String upiId = sc.nextLine();
            payment = new UpiPayment(0, upiId); 
        } else if (paymentChoice == 2) {
            System.out.print("Enter Card Number: ");
            String card = sc.nextLine();
            payment = new CardPayment(0, card); 
        } else {
            System.out.println("Invalid payment option.");
            System.exit(0);
        }

        // Step 4: Enter Discount %
        System.out.print("\nEnter discount percentage: ");
        double discountPercent = sc.nextDouble();

        // Lambda expression for discount logic
        Discountable discountable = amount -> amount - (amount * discountPercent / 100);

        // Step 5: Place Order
        Order order = new Order(customer, products);
        order.placeOrder(payment, discountable);

        sc.close();
    }
}
