package app;

import classes.Pessoa;
import contas.contaEspecial;

public class appContaEspecial {

	public static void main(String[] args) {
		contaEspecial el;
		Pessoa p1 = new Pessoa("Siclano", "ciclano@gmail.com");
		el = new contaEspecial(123334,p1,0.00f,-1000.00f);
		
		System.out.println("Saldo: "+ el.getSaldo());
		System.out.println("O limite é: " + el.getLimite());
		
		if(el.sacar(1000.00f)) {
			System.out.println("Saque realizado com sucesso!");
		}else {
			System.out.println("Limite insuficiente!");
		}
		System.out.println("Saldo atual "+ el.getSaldo());
	}
	
}
