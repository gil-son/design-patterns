package ex03.singleton.lazy_initialization;

// Lazy Initialization
public class DateUtilLazyInitialization {

	private static DateUtilLazyInitialization instance;
	
	private DateUtilLazyInitialization() {
		
	}
	
	public static DateUtilLazyInitialization getInstance() {
		if(instance == null) {
			instance = new DateUtilLazyInitialization();
		}
		
		return instance;
	}
	
}
