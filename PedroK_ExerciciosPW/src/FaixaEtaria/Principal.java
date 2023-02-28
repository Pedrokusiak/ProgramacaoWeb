package FaixaEtaria;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		FaixaEtaria faixaEtaria = new FaixaEtaria();
		Integer idade = Integer.parseInt(JOptionPane.showInputDialog("Digite uma idade: "));
		System.out.println(faixaEtaria.calcularIdade(idade));

	}

}
