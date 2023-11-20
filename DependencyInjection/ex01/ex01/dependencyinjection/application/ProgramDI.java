package ex01.dependencyinjection.application;

import ex01.dependencyinjection.services.MGDeductionServiceDI;
import ex01.dependencyinjection.services.PayServiceDI;
import ex01.dependencyinjection.services.SPDeductionServiceDI;
import ex01.withoutdependencyinjection.services.DeductionService;

public class ProgramDI {

	public static void main(String[] args) {
		MGDeductionServiceDI mg = new MGDeductionServiceDI();
		SPDeductionServiceDI sp = new SPDeductionServiceDI();
		
		PayServiceDI payService = new PayServiceDI(mg);
		
		double tax = payService.tax(1000.0);
		System.out.println(tax);
	}

}
