package CalculaIMC;

public class CalculaIMCimp implements ICalculaIMC {


	@Override
	public double calculaImc(double peso, double altura) {

		return (peso / (altura * altura));
	}

	@Override
	public String condicaoParticipante(double peso, double altura, char sexo) {
		double valorImc = calculaImc(peso, altura);

		if (sexo == 'F' || sexo =='f') {
			if (valorImc <= 19.1) {
				return "abaixo do Peso";
			} else if (valorImc > 19.1 && valorImc < 25.8) {
				return "no peso normal";
			} else if (valorImc > 25.8 && valorImc < 27.3) {
				return "marginamente acima do peso";
			} else if (valorImc > 27.3 && valorImc < 32.3) {
				return "acima do peso ideal";
			} else if (valorImc > 32.3) {
				return "obesa";
			}
		} 
		
		else if (sexo == 'M'|| sexo =='m') {
			if (valorImc <= 20.7) {
				return "abaixo do Peso";
			} else if (valorImc > 20.7 && valorImc < 26.4) {
				return "no peso normal";
			} else if (valorImc > 26.4 && valorImc < 27.8) {
				return "marginamente acima do peso";
			} else if (valorImc > 27.8 && valorImc < 31.1) {
				return "acima do peso ideal";
			} else if (valorImc > 31.1) {
				return "obeso";
			}
			return "Valores informado Incorreto";
		}
		return "Valores informado Incorreto";
	}
}
