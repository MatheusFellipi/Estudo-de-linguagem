package exMuseu;

public class Outros extends ObraArte{
	private String tipoObjeto;
	private String estiloObjeto;
	
	public Outros(int codigo, String titulo, Artista artista, int anoCriacao, String descricao, String pais,
			String periodo, String tipoObjeto, String estiloObjeto) {
		super(codigo, titulo, artista, anoCriacao, descricao, pais, periodo);
		this.tipoObjeto = tipoObjeto;
		this.estiloObjeto = estiloObjeto;
	}

	public Outros(int codigo, String titulo, String descricao, String pais, String periodo, String tipoObjeto,
			String estiloObjeto) {
		super(codigo, titulo, descricao, pais, periodo);
		this.tipoObjeto = tipoObjeto;
		this.estiloObjeto = estiloObjeto;
	}

	public String getTipoObjeto() {
		return tipoObjeto;
	}
	public void setTipoObjeto(String tipoObjeto) {
		this.tipoObjeto = tipoObjeto;
	}
	public String getEstiloObjeto() {
		return estiloObjeto;
	}
	public void setEstiloObjeto(String estiloObjeto) {
		this.estiloObjeto = estiloObjeto;
	}
	
}
