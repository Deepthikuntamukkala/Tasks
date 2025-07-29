package multithreading;

class Thread2 implements Runnable {
	@Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(" " + i);
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread2 t2 = new Thread2();
        Thread thread = new Thread(t2); 
        thread.start(); 
	}

}
