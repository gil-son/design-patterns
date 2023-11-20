package ex02.withoutdependencyinjection.services;

public class SalaryService {
	
	// Coupled solution - not a good practice
	
	private SocialSecurityService socialSecurityService = new SocialSecurityService();

	public double netSalary(double grossSalary) {
		
		double tax = grossSalary * 0.2;
		double socialSecurity = socialSecurityService.discount(grossSalary);
		
		return grossSalary - tax - socialSecurity;
	}
}
