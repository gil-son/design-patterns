package ex03;

public class Test {

	public static void main(String[] args) {
		
		DateUtil dateUtil1 = DateUtil.getInstance();
		DateUtil dateUtil2 = DateUtil.getInstance();
		
		
		System.out.print(dateUtil1 == dateUtil2);
	}
	
}
