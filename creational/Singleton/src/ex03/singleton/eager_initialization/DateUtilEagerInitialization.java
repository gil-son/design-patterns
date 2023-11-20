package ex03.singleton.eager_initialization;

public class DateUtilEagerInitialization {

	private static DateUtilEagerInitialization instance;
	
	
	// Eager Initialize when class are created
	static {
		instance = new DateUtilEagerInitialization();
	}
	
	private DateUtilEagerInitialization() {
		
	}
	
	public static DateUtilEagerInitialization getInstance() {
		return instance;
	}
	
}
