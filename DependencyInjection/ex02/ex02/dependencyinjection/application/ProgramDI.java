package ex02.dependencyinjection.application;

import ex02.dependencyinjection.services.SocialSecurityServiceDI;
import ex02.dependencyinjection.services.SalaryServiceDI;

public class ProgramDI {

	public static void main(String[] args) {
		
		SocialSecurityServiceDI socialSecurityService = new SocialSecurityServiceDI();
		
		SalaryServiceDI salaryService = new SalaryServiceDI(socialSecurityService);
		System.out.println(salaryService.netSalary(4000.0));
	}
}
