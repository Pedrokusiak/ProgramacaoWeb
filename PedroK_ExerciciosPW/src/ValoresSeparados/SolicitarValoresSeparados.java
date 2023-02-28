package ValoresSeparados;
import java.util.List;

public class SolicitarValoresSeparados {
	public void pedirValores(String valor) {

		String[] nomeQualquer = valor.split(",");

		for (int i = nomeQualquer.length - 1; i >= 0; i--) {
			System.out.println(nomeQualquer[i]);
		}
	}
}
