package CalculaSalario;

import javax.swing.JOptionPane;

public class FolhaPagamento {

	public static void main(String[] args) {
		double valorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor da hora trabalhada."));
		double quantHora = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas."));
		
		CalcularDesconto cd = new CalcularDesconto();
		
		double salarioBruto = cd.salarioBruto(quantHora, valorHora);
		double impostoRenda = cd.impostoRenda(salarioBruto);
		double inss = cd.inss(salarioBruto);
		double fgts = cd.fgts(salarioBruto);
		double totalDesc = cd.totaldesc(salarioBruto);
		double salarioLiquido = cd.salarioLiquido(salarioBruto, totalDesc);
		System.out.println("Salario Bruto: R$"+salarioBruto);
		System.out.println("(-) Imposto de Renda: R$"+impostoRenda);
		System.out.println("(-) INSS: R$"+inss);
		System.out.println("FGTS: "+fgts);
		System.out.println("Total de descontos: R$"+totalDesc);
		System.out.println("Salario Liquido: R$"+salarioLiquido);
	}

}
