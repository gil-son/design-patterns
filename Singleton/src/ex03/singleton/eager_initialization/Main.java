package ex03.singleton.eager_initialization;

public class Main {

	public static void main(String[] args) {
		
		DateUtilEagerInitialization dateUtilEagerInitialization1 = DateUtilEagerInitialization.getInstance();
		DateUtilEagerInitialization dateUtilEagerInitialization2 = DateUtilEagerInitialization.getInstance();
		
		
		System.out.print(dateUtilEagerInitialization1 == dateUtilEagerInitialization2);
	}
	
}
