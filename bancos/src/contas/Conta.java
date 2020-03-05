package contas;

import classes.Pessoa;

public abstract class Conta {
	
	protected int numero;
	protected Pessoa correntista;
	protected float saldo;
	
	public Conta() {}
	
	public Conta(int numero, Pessoa correntista, float saldo) {
		this.setNumero(numero);
		this.setCorrentista(correntista);
		this.setSaldo(saldo);
	}
	
	public final int getNumero() {
		return numero;
	}
	public final void setNumero(int numero) {
		this.numero = numero;
	}
	public final Pessoa getCorrentista() {
		return correntista;
	}
	public final void setCorrentista(Pessoa correntista) {
		this.correntista = correntista;
	}
	public final float getSaldo() {
		return saldo;
	}
	public final void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public final void depositar(float valor) {
		this.setSaldo(this.getSaldo() + valor);
	}
	
	public abstract boolean sacar(float valor);
	
}
