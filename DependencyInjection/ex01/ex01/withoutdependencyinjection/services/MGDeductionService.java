package ex01.withoutdependencyinjection.services;

public class MGDeductionService implements DeductionService {

	@Override
	public double deduction(double amount) {
		return amount * 0.12;
	}

}
