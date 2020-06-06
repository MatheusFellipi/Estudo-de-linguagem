public class TestaAluguel {
	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.setAno(2018);
		carro.setModelo("Ferrari F436834");
		carro.setCor("Vermelho ferrari");
		carro.setPlaca("MDF 12345");
		carro.setPreco(1000.0);
		
		Cliente cliente = new Cliente();
		cliente.setNome("Marcel");
		cliente.setCpf("2367548");
		cliente.setCartaoCredito("123 123 123 123");
		
		Aluguel aluguel = new Aluguel();
		aluguel.alugar(carro, cliente, "10/10/10");
		aluguel.devolver("10/12/10", 50);
		
	}
}
