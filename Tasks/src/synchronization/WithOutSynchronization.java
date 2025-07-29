package synchronization;
class SharedCounter {
    static int counter = 0;
}

class CounterTask extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            SharedCounter.counter++; 
        }
    }
}

public class WithOutSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CounterTask t1 = new CounterTask();
        CounterTask t2 = new CounterTask();

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Final counter value: " + SharedCounter.counter);
    }
}

