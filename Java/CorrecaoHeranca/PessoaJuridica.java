package CorrecaoHeranca;

public class PessoaJuridica extends Pessoa{
	private String nomeFantasia;
	private String cnpj;
	
	public PessoaJuridica(String nome, String email, String telefone, String nomeFantasia, String cnpj) {
		super(nome, email, telefone);
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
	}
	
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
