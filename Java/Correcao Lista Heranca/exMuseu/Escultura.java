package exMuseu;

public class Escultura extends ObraArte{
	private String material;
	private double altura;
	private double peso;
	private String estilo;
	
	public Escultura(int codigo, String titulo, String descricao, String pais, String periodo, String material,
			double altura, double peso, String estilo) {
		super(codigo, titulo, descricao, pais, periodo);
		this.material = material;
		this.altura = altura;
		this.peso = peso;
		this.estilo = estilo;
	}
	
	public Escultura(int codigo, String titulo, Artista artista, int anoCriacao, String descricao, String pais,
			String periodo, String material, double altura, double peso, String estilo) {
		super(codigo, titulo, artista, anoCriacao, descricao, pais, periodo);
		this.material = material;
		this.altura = altura;
		this.peso = peso;
		this.estilo = estilo;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
}
