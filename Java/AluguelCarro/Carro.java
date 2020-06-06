
public class Carro {
	private String placa;
	private String cor;
	private String modelo;
	private int ano;
	private double preco;
	private boolean disponivel = true;
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
	public void alugado() {
		this.disponivel = false;
	}
	public void devolvido() {
		this.disponivel = true;
	}
	
	
	
	
}
