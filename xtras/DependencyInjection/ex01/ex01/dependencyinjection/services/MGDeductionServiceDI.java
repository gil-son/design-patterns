package ex01.dependencyinjection.services;

public class MGDeductionServiceDI implements DeductionServiceDI {

	@Override
	public double deduction(double amount) {
		return amount * 0.12;
	}

}
