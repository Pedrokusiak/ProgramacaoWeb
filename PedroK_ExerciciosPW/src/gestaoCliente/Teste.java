package gestaoCliente;

public class Teste {

	public static void main(String[] args) {
		
		Cliente cli1 = new Cliente();
		cli1.setId();
		System.out.print(cli1.getId());
		
		Cliente cli2 = new Cliente();
		cli2.setId();
		System.out.print(cli2.getId());
		
		Endereco end = new Endereco();
		end.setRua("dnsad");
		cli2.setEndereco(end);
		cli2.toString();
		cli2.setNome("Jesus Cristo");
		
		System.out.println(cli2.toString());
	}

}
