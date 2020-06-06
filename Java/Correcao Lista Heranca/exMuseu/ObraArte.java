package exMuseu;

public abstract class ObraArte {
	private int codigo;
	private String titulo;
	private Artista artista;
	private int anoCriacao;
	private String descricao;
	private String pais;
	private String periodo;
	private boolean exposta;
	
	public ObraArte(int codigo, String titulo, String descricao, String pais, String periodo) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.descricao = descricao;
		this.pais = pais;
		this.artista = null;
		this.anoCriacao = -1;
		this.periodo = periodo;
		this.exposta = false;
	}
	
	public ObraArte(int codigo, String titulo, Artista artista, int anoCriacao, String descricao, String pais,
			String periodo) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.artista = artista;
		this.anoCriacao = anoCriacao;
		this.descricao = descricao;
		this.pais = pais;
		this.periodo = periodo;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Artista getArtista() {
		return artista;
	}
	public void setArtista(Artista artista) {
		this.artista = artista;
	}
	public int getAnoCriacao() {
		return anoCriacao;
	}
	public void setAnoCriacao(int anoCriacao) {
		this.anoCriacao = anoCriacao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public void exporObraExposicao() {
		this.exposta = true;
	}
	public void retirarObraExposicao() {
		this.exposta = false;
	}
	public boolean isObraExposta() {
		return this.exposta;
	}
}
