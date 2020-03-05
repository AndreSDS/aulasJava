package bancos;

public class appConta {

	public static void main(String[] args) {
		
		Pessoa p1, p2;
		Conta c1, c2;
		
		p1 = new Pessoa("Fulano", "fulano@gmail.com");
		p2 = new Pessoa("Sicrano", "sicrano@gmail.com");
		
		c1 = new Conta(129876,p1,150.00f);
		c2 = new Conta(23333,p2,750.00f);
		
		System.out.println("O nome do correntista é: " + c1.getCorrentista().getNome());
		System.out.println("O número da conta é: " + c1.getNumero());
		System.out.println("O saldo é: " + c1.getSaldo());
		
		System.out.println("O nome do correntista é: " + c2.getCorrentista().getNome());
		System.out.println("O número da conta é: " + c2.getNumero());
		System.out.println("O saldo é: " + c2.getSaldo());
		
		if (c2.sacar(750.00f)) {
			System.out.println("Efetuado com sucesso!");
		}else{
			System.out.println("Saldo insuficiente!");
		};
		
		c2.depositar(100.00f);
		System.out.println("Saldo atual: " + c2.getSaldo());

	}

}
