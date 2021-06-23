package ex02.withoutdependencyinjection.application;

import ex02.withoutdependencyinjection.services.SalaryService;

public class Program {

	public static void main(String[] args) {
		
		SalaryService salaryService = new SalaryService();
		System.out.println(salaryService.netSalary(4000.0));
	}
}
