package _03ValoresSeparados;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String entrada = JOptionPane.showInputDialog("Digite numeros separados por virgula (,)");
		String[] valores = entrada.split(",");
		String saida = "";
		for (int x = valores.length - 1; x >= 0; x--) {
			saida = saida + valores[x] + "";

			System.out.println(valores[x]);
		}
	}
}
