package CalculaSalario;

public interface ICalculaSalario {
	double salarioBruto (double quantHora, double valorHora);
	double impostoRenda (double salarioBruto);
	double inss (double salarioBruto);
	double fgts (double salarioBruto);
	double totaldesc (double impostoRenda);
	double salarioLiquido (double salarioBruto, double totaldesc);
}
