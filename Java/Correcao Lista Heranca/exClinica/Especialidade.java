package exClinica;

public class Especialidade {
	private String nome;
	private String crm;
	
	public Especialidade(String nome, String crm) {
		super();
		this.nome = nome;
		this.crm = crm;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
}
