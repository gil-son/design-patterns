package ex03.singleton.multiple_threads;



public class DateUtilSolutionMutipleThread {

	private static DateUtilSolutionMutipleThread instance;
	
	
	private DateUtilSolutionMutipleThread() {
		
	}
	
	
	// Can synchronize method: public static synchronized DateUtilSolutionMutipleThread
	
	/*
	 	Make sure that this method will be accessed only by one thread at a time to make our code even better instead of synchronizing the entire method we can get rid of the key

		word from here and we can mark this block of code as synchronized to do that.

        Use synchronized within brackets synchronized the block will start from here and it will end right after we create an instance after this if block

		and within this synchronized block within this parenthesis we need to aquire a lock on the object or on the class dateutil dot class.

		So we have a class level lock.
	 
	 */
	
	public static DateUtilSolutionMutipleThread getInstance() {
		
	// Can synchronize by block
	 	
		 synchronized(DateUtilSolutionMutipleThread.class)	{
			 if (instance == null) {
				 instance = new DateUtilSolutionMutipleThread();
			 }
			 return instance;
		 }
	 
	 }
		
}
	

