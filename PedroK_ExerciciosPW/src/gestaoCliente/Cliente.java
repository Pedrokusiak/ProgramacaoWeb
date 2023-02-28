package gestaoCliente;

import java.util.concurrent.atomic.AtomicInteger;

public class Cliente {
	private int id;
	private String nome;
	private Endereco[] endereco;
	private static final AtomicInteger count = new AtomicInteger(0);
	
	public String toString() {
		return getNome() 
				+ "\n" 
				+ getEndereco().getRua() 
				+ "\n"
				+ getEndereco().getNumero();
	}
	
	public int getId() {
		return id;
	}
	public void setId() {
		this.id = count.incrementAndGet();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		for(int i = 0; i >= endereco.length -1; i++) {
			return endereco[i];
		}
		return null;
	}
	public void setEndereco(Endereco endereco) {
		if(this.endereco[0] == null) {
			this.endereco[0] = endereco;
		}
		else 
		{
			this.endereco[this.endereco.length + 1] = endereco;
		}
	}
	
}
