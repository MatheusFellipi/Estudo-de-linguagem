
public class Cliente {
	private String nome;
	private String cpf;
	private String cartaoCredito;
	private boolean temAluguel = false;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCartaoCredito() {
		return cartaoCredito;
	}
	public void setCartaoCredito(String cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}
	public boolean isTemAluguel() {
		return this.temAluguel;
	}
	public void alugar() {
		this.temAluguel = true;
	}
	public void devolver() {
		this.temAluguel = false;
	}
	
}
