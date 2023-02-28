package gestaoCliente;

import java.util.concurrent.atomic.AtomicInteger;

public class Endereco {
	private int id;
	private String rua;
	private int numero;
	private static final AtomicInteger count = new AtomicInteger(0);
	
	public int getId() {
		return id;
	}
	public void setId() {
		this.id = count.incrementAndGet();
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
