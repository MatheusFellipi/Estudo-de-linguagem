package CorrecaoHeranca;

public class ContaUniversitaria extends Conta{
	private String escolinha;

	public ContaUniversitaria(String nroConta, String agencia, String escolinha) {
		super(nroConta, agencia);
		this.escolinha = escolinha;
	}

	public String getEscolinha() {
		return escolinha;
	}

	public void setEscolinha(String escolinha) {
		this.escolinha = escolinha;
	}

	
	public boolean sacar(double valor) {
		
		return false;
	}

	
	public boolean transferir(double valor, Conta conta) {
		
		return false;
	}
	
	
}
