package ex01.withoutdependencyinjection.application;

import ex01.withoutdependencyinjection.services.MGDeductionService;
import ex01.withoutdependencyinjection.services.PayService;
import ex01.withoutdependencyinjection.services.SPDeductionService;

public class Program {

	public static void main(String[] args) {
		MGDeductionService mg = new MGDeductionService();
		SPDeductionService sp = new SPDeductionService();
		
		PayService payService = new PayService();
		double tax = payService.tax(1000.0);
		System.out.println(tax);
	}

}
