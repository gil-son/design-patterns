package ex01.dependencyinjection.services;

public class SPDeductionServiceDI implements DeductionServiceDI{
	
	@Override
	public double deduction(double amount) {
		return amount * 0.10;
	}
}
