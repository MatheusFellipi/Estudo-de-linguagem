package CorrecaoHeranca;

public class ContaPoupanca extends ContaCorrente{

	public ContaPoupanca(String nroConta, String agencia, PessoaFisica cliente) {
		super(nroConta, agencia, cliente);
	}

	public void render() {
		double resultado = super.getSaldo()*1.005; 
		super.setSaldo(resultado);
	}
}
