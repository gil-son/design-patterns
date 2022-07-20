package ex03;

public class DateUtil {

	private static DateUtil instance;
	
	private DateUtil() {
		
	}
	
	public static DateUtil getInstance() {
		if(instance == null) {
			instance = new DateUtil();
		}
		
		return instance;
	}
	
}
