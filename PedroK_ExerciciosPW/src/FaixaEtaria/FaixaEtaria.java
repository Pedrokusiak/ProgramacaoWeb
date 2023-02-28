package FaixaEtaria;

public class FaixaEtaria {
	
	public String calcularIdade(int idade) {
		if( idade <= 12) {
			return "Criança";
		} else if (idade <= 18 && idade >= 15) {
			return "Adolescente";
		} else if( idade <= 60 && idade >= 18) {
			return "Adulto";
		} else {
			return "Idoso";
		}
	}
}
