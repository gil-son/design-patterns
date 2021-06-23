package ex01.withoutdependencyinjection.services;

public class PayService {
	
									 // new SPDeductionService();
	DeductionService deductionService = new MGDeductionService();
	
	public double tax(double amount) {
		amount = amount - deductionService.deduction(amount);
		return amount * 0.2;
	}
}
