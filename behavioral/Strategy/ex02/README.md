# Strategy

English version coming soon

Esse documento vai evoluir junto comigo, então enquanto eu viver, ele tende a crescer, se eu morrer ele evoluiu até lá.
Existem algumas exceções para deixar de documentar, como uma arquitetura mais limpa e/ou tecnologia mais otimizada.

É muito comum perante uma regra de negócio o desenvolvedor utilizar condicionais para atender aquela demanda. Por exemplo, imagina
a seguinte situação, a sua empresa recebe relatórios de impostos e para cada tipo de imposto há uma taxa a ser descontada:

Relatório 1: 

valor 1000,00 
Tipo Imposto: ISS
Desconto: -10%

Relatório 2:
Valor 1000,000
Tipo Imposto: ICMS
Desconto: -20%


Relatório 3:
Valor 1000,000
Tipo Imposto: INSS
Desconto: -0.5%


Sem problemas, para cada imposto cria um if e vida que segue... Bom, enquanto a empresa calcular poucos tipos de impostos, é algo
até válido e aparentemente não vai requerir muito esforço. Mas conforme a quantidade de impostos aumentarem, a quantidade de if's
aumentarão... a manutenção vai requerer que toda a operação pare, pois tudo está centrado no mesmo local... entre outras coisas:

public class CalculaImposto{

 public void CalculaImposto(imposto, valor){

	if(imposto == ISS){
		valor - (valor * 0.1)
	}else if(imposto == ICMS){
		valor - (valor * 0.2)
	}else if(imposto == INSS){
		valor - (valor * 0.05)
	}
.
.
.

	}
	
}


Uma alternativa aparentemente, seria criar funções, mas apenas mudariamos o problema de lugar

public class CalculaImposto{

 public void CalculaImposto(imposto, valor){

	

	}
	
}



Mas apenas mudamos o problema de lugar...


Bom, repare que as funções tem algo em comum, sempre recebem o tipo de imposto e o valor... a partir delas podemos criar um contrato, no nosso caso
uma interface 









"se eu morrer" ... 