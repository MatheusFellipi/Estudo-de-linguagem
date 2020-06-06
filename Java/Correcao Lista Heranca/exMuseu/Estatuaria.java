package exMuseu;

public class Estatuaria extends Escultura{
	private String homenageado;
	
	public Estatuaria(int codigo, String titulo, Artista artista, int anoCriacao, String descricao, String pais,
			String periodo, String material, double altura, double peso, String estilo, String homenageado) {
		super(codigo, titulo, artista, anoCriacao, descricao, pais, periodo, material, altura, peso, estilo);
		this.homenageado = homenageado;
	}

	public Estatuaria(int codigo, String titulo, String descricao, String pais, String periodo, String material,
			double altura, double peso, String estilo, String homenageado) {
		super(codigo, titulo, descricao, pais, periodo, material, altura, peso, estilo);
		this.homenageado = homenageado;
	}

	public String getHomenageado() {
		return homenageado;
	}

	public void setHomenageado(String homenageado) {
		this.homenageado = homenageado;
	}
}
