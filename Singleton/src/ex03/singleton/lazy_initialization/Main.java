package ex03.singleton.lazy_initialization;

public class Main {

	public static void main(String[] args) {
		
		DateUtilLazyInitialization dateUtilLazyInitialization1 = DateUtilLazyInitialization.getInstance();
		DateUtilLazyInitialization dateUtilLazyInitialization2 = DateUtilLazyInitialization.getInstance();
		
		
		System.out.print(dateUtilLazyInitialization1 == dateUtilLazyInitialization2);
	}
	
}
