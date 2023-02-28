package IMC;

public class Imc {
	public String calcularImc(String sexo, float peso, float altura) {
		float imc = (peso / (altura * altura));
		sexo = sexo.toLowerCase();
		if (sexo.equals("f")) {
			if (imc <= 19.1) {
				return "Abaixo do peso " + imc;
			} else if (imc <= 25.8 && imc > 19.1) {
				return "Peso Normal " + imc;
			} else if (imc <= 27.3 && imc > 25.8) {
				return "Marginalmente Acima do peso " + imc;
			} else if (imc <= 32.3 && imc > 27.3) {
				return "Acima do peso " + imc;
			} else {
				return "Obeso " + imc;
			}
		} else if (sexo.equals("m")){
			if (imc <= 20.7) {
				return "Abaixo do peso " + imc;
			} else if (imc <= 26.4 && imc > 20.7) {
				return "Peso Normal " + imc;
			} else if (imc <= 27.8 && imc > 26.4) {
				return "Marginalmente Acima do peso " + imc;
			} else if (imc <= 31.1 && imc > 27.8) {
				return "Acima do peso " + imc;
			} else {
				return "Obeso " + imc;
			}
		} else {
			return "Sexo indisponivel";
		}
	}
}
