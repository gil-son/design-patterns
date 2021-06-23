package ex01.withoutdependencyinjection.services;

public class SPDeductionService implements DeductionService{
	
	@Override
	public double deduction(double amount) {
		return amount * 0.10;
	}
}
