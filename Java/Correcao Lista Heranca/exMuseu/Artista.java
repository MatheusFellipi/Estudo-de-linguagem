package exMuseu;

public class Artista {
	private String nome;
	private String dtNascimento;
	private String dtMorte;
	private String estilo;
	private String nacionalidade;
	private String periodo;
	private String descricao;
	
	public Artista(String nome, String dtNascimento, String estilo, String nacionalidade, String periodo,
			String descricao) {
		super();
		this.nome = nome;
		this.dtNascimento = dtNascimento;
		this.estilo = estilo;
		this.nacionalidade = nacionalidade;
		this.periodo = periodo;
		this.descricao = descricao;
	}
	
	public Artista(String nome, String estilo, String nacionalidade, String periodo, String descricao) {
		super();
		this.nome = nome;
		this.estilo = estilo;
		this.nacionalidade = nacionalidade;
		this.periodo = periodo;
		this.descricao = descricao;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public String getDtMorte() {
		return dtMorte;
	}
	public void setDtMorte(String dtMorte) {
		this.dtMorte = dtMorte;
	}
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
