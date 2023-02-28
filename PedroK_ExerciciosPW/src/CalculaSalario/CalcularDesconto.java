package CalculaSalario;

public class CalcularDesconto implements ICalculaSalario {

	@Override
	public double salarioBruto(double quantHora, double valorHora) {
		
		return quantHora * valorHora;
	}

	@Override
	public double impostoRenda(double salarioBruto) {
		if (salarioBruto <= 900) {
			return 0.0;
		}
		else if (salarioBruto <= 1500) {
			return salarioBruto * 0.05;
		}
		else if (salarioBruto <= 2500) {
			return salarioBruto * 0.1;
		}
		else if(salarioBruto > 2500) {
			return salarioBruto * 0.2;
		}
		return salarioBruto;
	}

	@Override
	public double inss(double salarioBruto) {
		
		return salarioBruto * 0.1;
	}

	@Override
	public double fgts(double salarioBruto) {
		
		return salarioBruto *0.11;
	}

	@Override
	public double totaldesc(double salarioBruto) {
		double valorImpostoRenda = impostoRenda(salarioBruto);
		return (salarioBruto * 0.1)+(valorImpostoRenda);
	}

	@Override
	public double salarioLiquido(double salarioBruto, double totaldesc) {
		double valorTotalDesc = totaldesc(salarioBruto);
		return (salarioBruto)-(valorTotalDesc);
	}

	
	
	
}
