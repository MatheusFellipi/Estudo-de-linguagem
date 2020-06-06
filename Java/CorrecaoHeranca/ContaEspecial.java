package CorrecaoHeranca;

public class ContaEspecial extends Conta {
	private PessoaFisica cliente;
	private double chequeEspecial;

	public ContaEspecial(String nroConta, String agencia, PessoaFisica cliente, double chequeEspecial) {
		super(nroConta, agencia);
		this.cliente = cliente;
		this.chequeEspecial = chequeEspecial;
	}

	public boolean sacar(double valor) {
		if((super.getSaldo()+this.chequeEspecial) >= valor && valor > 0) {
			double resultado = super.getSaldo() - valor;
			super.setSaldo(resultado);
			
			System.out.println("Saque realizado com sucesso!");
			return true;
		}
		System.out.println("Erro ao executar o saque!");
		return false;
	}

	
	public boolean transferir(double valor, ContaCorrente conta) {
		if(this.sacar(valor)) {
			if(conta.depositar(valor)) {
				return true;
			}else {
				super.depositar(valor);
				return false;
			}
		}else {
			return false;
		}
	}

	public PessoaFisica getCliente() {
		return cliente;
	}

	public void setCliente(PessoaFisica cliente) {
		this.cliente = cliente;
	}

	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
}
