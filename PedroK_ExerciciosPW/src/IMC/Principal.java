package IMC;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Imc imc = new Imc();
		String sexo = JOptionPane.showInputDialog("Qual seu sexo? digite a inicial");
		Float peso = Float.parseFloat(JOptionPane.showInputDialog("Qual seu peso em kg: "));
		Float altura = Float.parseFloat(JOptionPane.showInputDialog("Qual sua altura em metros: "));
		

		System.out.println(imc.calcularImc(sexo, peso, altura));
	}

}
