package ex03.singleton.multiple_threads;

public class Main {

	public static void main(String[] args) {
		
		DateUtilSolutionMutipleThread dateUtil1 = DateUtilSolutionMutipleThread.getInstance();
		DateUtilSolutionMutipleThread dateUtil2 = DateUtilSolutionMutipleThread.getInstance();
		
		
		System.out.print(dateUtil1 == dateUtil2);
	}
	
}
