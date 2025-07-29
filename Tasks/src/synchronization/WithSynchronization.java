package synchronization;
class SharedCounter1 {
    static int counter = 0; 
    static final Object lock = new Object(); 
}

class CounterTask1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            synchronized (SharedCounter1.lock) {
                SharedCounter1.counter++;
            }
        }
    }
}


public class WithSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CounterTask1 t1 = new CounterTask1();
        CounterTask1 t2 = new CounterTask1();

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Final counter value: " + SharedCounter1.counter);
    }
}

