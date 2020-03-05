package contas;

import classes.Pessoa;

public final class ContaComum extends Conta{
	
	public ContaComum() {}
	
	public ContaComum(int numero, Pessoa correntista, float valor) {
		super(numero, correntista, valor);
	}
	
	public boolean sacar(float valor) {
		if (this.getSaldo() >= valor) {
			this.setSaldo(this.getSaldo() - valor);
			return true;
		}
		return false;
	}

}
