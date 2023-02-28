package CalculaIMC;

import javax.swing.JOptionPane;

public class ParticipanteIMC {

	public static void main(String[] args) {
		String sexo = JOptionPane.showInputDialog("Digite M para Masculino e F para Feminino");
		char sexoChar = sexo.charAt(0);
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso em KG"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura em metros"));
		
		CalculaIMCimp imc = new CalculaIMCimp();
		double valorImc = imc.calculaImc(peso, altura);
		String condicao = imc.condicaoParticipante(peso, altura, sexoChar);
		System.out.println("Valor IMC: " + valorImc);
		System.out.println("Condicionamento: " + condicao);		
	}

}
