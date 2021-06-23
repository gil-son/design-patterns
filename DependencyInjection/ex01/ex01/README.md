# Dependency Injection0

## Exemplo 01

<ul>
<li>There will be an example without Dependency Injection and one with Dependency Injection</li>
<li>This example will be done in Java and the other using the Spring Boot framework to broaden the understanding of usage.</li>
</ul>

## Analyze WITHOUT Dependency Injection

<p> Imagine you have an amount of money and you want to find out how much tax you need to pay:</p>

```
package application;

import services.PayService;

public class Program {
	public static void main(String[] args) {
		PayService payService = new PayService();
		double tax = payService.tax(1000.0);
		System.out.println(tax);
	}
}

```

<p>In order to discover this tax, a payment service was instigated:</p>

```
  PayService payService = new PayService();
```

<p>Of this payment service, the 'tax' method was called, which refers to the tax, passing the amount of 1000.0:</p>

```
  double tax = payService.tax(1000.0);
```

<p> The result will be:</p>

```
176.0
```

<p>Why is the result 176.0? Accessing the 'PayService' class:</p>

```
package services;

public class PayService {
	DeductionService deductionService = new MGDeductionService();
	
	public double tax(double amount) {
		amount = amount - deductionService.deduction(amount);
		return amount * 0.2;
	}
}
```

<p>We see that it has a dependency for 'DeductionService deductionService' which is a deduction service (this remove a parte the amount before calculating the tax). Good This 'deductionService' has the instance of 'MGDeductionService ()', that is, it is the specific deduction service for the MG region. </p>


<p> If we access the 'DeductionService' we will see that it is an Interface that defines the 'deduction' method:</p>

```
package services;

public interface DeductionService {

	public double deduction(double amount);
}

```

<p>Then the class 'MGDeductionService' will implement the 'DeductionService' and will override the 'deduction' method informing that the value that you enter will return 12% of its value:</p>

```
package services;

public class MGDeductionService implements DeductionService{

	@Override
	public double deduction(double amount) {
		return amount * 0.12;
	}
}

```

<p> So going back to the 'PayService' class:</p>

```
package services;

public class PayService {
	DeductionService deductionService = new MGDeductionService();
	
	public double tax(double amount) {
		amount = amount - deductionService.deduction(amount);
		return amount * 0.2;
	}
}
```

<p> The 'tax ()' method will subtract the value that you enter with 12% of that value and then multiply that value by 20%. In the running of this process we have:</p>


```
  (1000.0 - (1000.0 * 0.12)) * 0.2 = 176.0
```

<p> Well, it works ... but if you need to implement another service, now referring to the SP location, we will need to change the PayService class and replace the instance with SPDeductionService (), you can create conditionals too ... but you need to change the class directly to change the instance and / or create conditionals ... it is not interesting for the development of the application and maintenance. Imagine that for each new service, a new conditional and / or instance? That is why we are going to use dependency inversion, better known as Dependency Injection.</p>


## Analysis WITH Dependency Injection


<p> Well, then we are going to implement the Dependency Injection concept. First, let's go to the 'PayService' class:</p>

```
package services;

public class PayService {
	DeductionService deductionService = new MGDeductionService();
	
	public double tax(double amount) {
		amount = amount - deductionService.deduction(amount);
		return amount * 0.2;
	}
}
```


<p> We decouple the fixed instance of MGDeductionService () leaving the 'DeductionService deductionService' without any link:</p>

```
package services;

public class PayService {
	DeductionService deductionService;
	
	public double tax(double amount) {
		amount = amount - deductionService.deduction(amount);
		return amount * 0.2;
	}
}

```
<p>Criamos um construtor para receber como parâmetro um 'deductionService' externo que será atribuido ao 'deductionService' interno:</p>

```
package services;

public class PayServiceDI {
	DeductionService deductionService;
	
	public PayServiceDI(DeductionService deductionService){
		this.deductionService = deductionService;
	}
	
	public double tax(double amount) {
		amount = amount - deductionService.deduction(amount);
		return amount * 0.2;
	}
}
```

<p> Look, before we had something fixed, now, we can couple something that comes out with our 'deduction'.</p>

<p>Well, but where will the external 'deductionService' come from? From the main class, in our case the Program:</p>


```
package application;

import services.PayService;

public class Program {
	public static void main(String[] args) {
		PayService payService = new PayService(new MGDeductionService() );
		double tax = payService.tax(1000.0);
		System.out.println(tax);
	}
}
```

<p> See that now the 'MGDeductionService ()' is instantiated in the Program (main) class, which frees us from messing with the PayService class that contains the business rule. We can optimize:</p>

```

public class ProgramDI {
	public static void main(String[] args) {
		// DeductionService deductionService = new MGDeductionService();
		
		MGDeductionService mg = new MGDeductionService();
		
		PayServiceDI payService = new PayService(mg);
		double tax = payService.tax(1000.0);
		System.out.println(tax);
	}
}
```

<p>If we execute:</p>

```
176.0
```

<p>If we want to implement the SP or other locales, just create a class: </p>

```
package services;

public class SPDeductionServiceDI implements DeductionService{

	@Override
	public double deduction(double amount) {
		return amount * 0.10;
	}
}
```

<p>Then just:</p>

```
public class ProgramDI {
	public static void main(String[] args) {
		// DeductionService deductionService = new MGDeductionService();
		
		MGDeductionService mg = new MGDeductionService();
		SPDeductionService sp = new MGDeductionService();
		
		PayServiceDI payService = new PayService(sp);
		double tax = payService.tax(1000.0);
		System.out.println(tax);
	}
}
```

<p>If we execute:</p>

```
180.0
```

## Source:

<ul>
	<li><a href="https://www.youtube.com/watch?v=O07XFebgw-g">DevSuperior - Injeção de dependência e inversão de controle</a></li>
</ul>
