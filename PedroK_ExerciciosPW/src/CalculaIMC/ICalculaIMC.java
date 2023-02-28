package CalculaIMC;

public interface ICalculaIMC {

	double calculaImc (double peso, double altura);
	String condicaoParticipante(double peso, double altura, char sexo);
	
}
