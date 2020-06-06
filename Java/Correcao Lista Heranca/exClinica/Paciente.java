package exClinica;

public class Paciente extends PessoaFisica{
	private String profissao;
	private String dtNascimento;
	
	public Paciente(String nome, String telefone, String endereco, String cpf, String profissao, String dtNascimento) {
		super(nome, telefone, endereco, cpf);
		this.profissao = profissao;
		this.dtNascimento = dtNascimento;
	}
	
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	
	
}
