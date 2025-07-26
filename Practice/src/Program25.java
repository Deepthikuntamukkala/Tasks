interface Logger{
	default void logInfo() {
		System.out.println("This is LogInfo");
	}
	static void logError() {
		System.out.println("This is LogError");
	}
}
class AppLogger implements Logger{
}
public class Program25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppLogger al=new AppLogger();
		al.logInfo();
		Logger.logError();

	}

}
