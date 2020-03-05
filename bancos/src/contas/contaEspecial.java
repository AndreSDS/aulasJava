package contas;

import classes.Pessoa;

public final class contaEspecial extends Conta {
	
	private float limite;
	
	public contaEspecial() {
		// TODO Auto-generated constructor stub
	}
	
	public contaEspecial(int numero, Pessoa correntista, float valor, float limite) {
		super(numero, correntista, valor);
		this.setLimite(limite);
	}
	
	public float getLimite() {
		return limite;
	}
	
	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	public boolean sacar(float valor) {
		if (this.getSaldo() - valor >= this.getLimite()) {
			this.setSaldo(this.getSaldo() - valor);
			return true;
		}
		return false;
	}
}
