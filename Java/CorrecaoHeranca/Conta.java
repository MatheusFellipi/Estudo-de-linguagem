package CorrecaoHeranca;

public class Conta {
	private String nroConta;
	private String agencia;
	private double saldo;
	
	public Conta(String nroConta, String agencia) {
		super();
		this.nroConta = nroConta;
		this.agencia = agencia;
		this.saldo = 0;
	}

	public String getNroConta() {
		return nroConta;
	}

	public void setNroConta(String nroConta) {
		this.nroConta = nroConta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	protected double getSaldo() {
		return saldo;
	}

	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void extrato() {
		System.out.println("Nro Conta: "+ this.nroConta );
		System.out.println("Saldo da Conta: "+ this.saldo );
	}
	
	public boolean depositar(double valor) {
		if(valor > 0) {
			this.saldo += valor;
			System.out.println("Deposito realizado com sucesso!");
			return true;
		}
		System.out.println("Erro ao executar o deposito!");
		return false;
	}
	
	public abstract boolean sacar(double valor);
	public abstract boolean transferir(double valor, Conta conta);
}
