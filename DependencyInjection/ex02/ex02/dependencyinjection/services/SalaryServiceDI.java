package ex02.dependencyinjection.services;

import ex02.dependencyinjection.services.SalaryServiceDI;
import ex02.withoutdependencyinjection.services.SocialSecurityService;

public class SalaryServiceDI {
	
	// Uncoupled solution - not a good practice
		SocialSecurityServiceDI socialSecurityService;
		
	
	
	public SalaryServiceDI(SocialSecurityServiceDI socialSecurityService) {
		this.socialSecurityService = socialSecurityService;
	}
	
	public double netSalary(double grossSalary) {
		
		double tax = grossSalary * 0.2;
		double socialSecurity = socialSecurityService.discount(grossSalary);
		
		return grossSalary - tax - socialSecurity;
	}
}
