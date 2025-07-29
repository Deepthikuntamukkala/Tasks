package multithreading;

class NumPrinter extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread1: " + i);
                Thread.sleep(1000); 
            }
        } catch (InterruptedException e) {
            System.out.println("Thread1 was interrupted.");
        }
    }
}

public class Thread3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumPrinter thread1 = new NumPrinter();
        thread1.start(); // Start Thread1

        try {
            thread1.join(); // Main thread waits for thread1 to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        System.out.println("Main thread done.");
    

	}

}
