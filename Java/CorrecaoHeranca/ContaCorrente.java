package CorrecaoHeranca;
public class ContaCorrente extends Conta{
	private PessoaFisica cliente;
	
	public ContaCorrente(String nroConta, String agencia, PessoaFisica cliente) {
		super(nroConta, agencia);
		this.cliente = cliente;
	}
	
	public boolean sacar(double valor) {
		if(super.getSaldo() >= valor && valor > 0) {
			double saldoResultante = super.getSaldo() - valor;
			super.setSaldo(saldoResultante);
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
}
