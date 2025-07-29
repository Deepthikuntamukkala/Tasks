package multithreading;
class Thread1 extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello from Thread!");
                Thread.sleep(1000); 
            }
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted.");
        }
    }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 thread = new Thread1();
        thread.start(); 

	}

}
