package multithreading;
class ThreadWithJoin extends Thread {

    @Override
    public void run() {
    	for(int i =1;i<=5;i++) {
    		System.out.println(i);
    	}
        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }
}

public class Thread4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadWithJoin thread = new ThreadWithJoin();
        System.out.println("Before start: " + thread.isAlive());
        thread.start();
        System.out.println("After start: " + thread.isAlive());
        try {
            thread.join(); 
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("After join: " + thread.isAlive());

	}

}
