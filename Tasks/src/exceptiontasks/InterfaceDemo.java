package exceptiontasks;

interface RemoteControl {
    void turnOn();
    default void batteryStatus() {
        System.out.println("Battery status: Fully Charged");
    }
}

class TV implements RemoteControl {
    public void turnOn() {
        System.out.println("TV is now ON.");
    }
}

public class InterfaceDemo {
     public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV myTV = new TV();
        myTV.turnOn();           
        myTV.batteryStatus();    
     }
}
	

	