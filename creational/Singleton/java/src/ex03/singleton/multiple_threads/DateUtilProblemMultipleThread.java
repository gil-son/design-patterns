package ex03.singleton.multiple_threads;

/*
  
  That is if multiple threads are trying to access this particular get instance method we should still make

sure that there is only one instance that is being created in the application of this particular class.



 */


public class DateUtilProblemMultipleThread {

	private static DateUtilProblemMultipleThread instance;
	
	
	private DateUtilProblemMultipleThread() {
		
	}
	
	
	/*
	 
	 If we have two threads which are trying to create an instance of dateutil create the first thread

		first enter this method it will do this check and it's about to create an instance. 

	 */
	
	public static DateUtilProblemMultipleThread getInstance() {
		
	/*
	 
	 In the meantime if another thread comes and does this check even before the first thread creates this instance

		this expression in line 46 will evaluate to true.


	It will go in and in the meantime the first thread would have created an instance and the second thread also will

		create an instance so will end up having two instances. See the Solution in the class DateUtilSolutionMutipleThread
	 
	 */
	 if (instance == null) {
			 instance = new DateUtilProblemMultipleThread();
		 }
		 return instance;
		 
	 }
		
}
	

