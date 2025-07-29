package multithreading;
class PriorityTask extends Thread {
    public PriorityTask(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println(getName() + " is running with priority: " + getPriority());
    }
}

public class Thread5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityTask t1 = new PriorityTask("Thread-1");
        PriorityTask t2 = new PriorityTask("Thread-2");
        PriorityTask t3 = new PriorityTask("Thread-3");

        t1.setPriority(Thread.MIN_PRIORITY);   
        t2.setPriority(Thread.NORM_PRIORITY);  
        t3.setPriority(Thread.MAX_PRIORITY);   

        t1.start();
        t2.start();
        t3.start();

	}

}
