package ex02;

public class CalculadorDeImpostos {
	
	public void realizaCalculo( Orcamento orcamento, Imposto impostoQualquer) {
		
		double imposto = impostoQualquer.calcula(orcamento);
		System.out.println(imposto);
	}
}
