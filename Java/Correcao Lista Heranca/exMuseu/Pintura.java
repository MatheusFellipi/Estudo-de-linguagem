package exMuseu;

public class Pintura extends ObraArte{
	private String tipoTinta;
	private String tipoMaterial;
	private String estiloPintura;
	
	public Pintura(int codigo, String titulo, String descricao, String pais, String periodo, String tipoTinta,
			String tipoMaterial, String estiloPintura) {
		super(codigo, titulo, descricao, pais, periodo);
		this.tipoTinta = tipoTinta;
		this.tipoMaterial = tipoMaterial;
		this.estiloPintura = estiloPintura;
	}
	
	public Pintura(int codigo, String titulo, Artista artista, int anoCriacao, String descricao, String pais,
			String periodo, String tipoTinta, String tipoMaterial, String estiloPintura) {
		super(codigo, titulo, artista, anoCriacao, descricao, pais, periodo);
		this.tipoTinta = tipoTinta;
		this.tipoMaterial = tipoMaterial;
		this.estiloPintura = estiloPintura;
	}
	public String getTipoTinta() {
		return tipoTinta;
	}
	public void setTipoTinta(String tipoTinta) {
		this.tipoTinta = tipoTinta;
	}
	public String getTipoMaterial() {
		return tipoMaterial;
	}
	public void setTipoMaterial(String tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}
	public String getEstiloPintura() {
		return estiloPintura;
	}
	public void setEstiloPintura(String estiloPintura) {
		this.estiloPintura = estiloPintura;
	}
}
