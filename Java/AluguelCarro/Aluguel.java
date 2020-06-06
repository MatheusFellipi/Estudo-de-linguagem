public class Aluguel {
	private Carro carro;
	private Cliente cliente;
	private double valorTotal;
	private String dataInicio;
	private String dataFim;
	private int diasAlugados;
	
	
	public boolean alugar(Carro carro, Cliente cliente, String dataInicio) {
		if(carro.isDisponivel() && !cliente.isTemAluguel()) {
			this.carro = carro;
			this.cliente = cliente;
			this.dataInicio = dataInicio;
			
			this.carro.alugado();
			this.cliente.alugar();
			
			System.out.println("Aluguel realizado com sucesso!");
			return true;
		}
		System.out.println("Aluguel não realizado!");
		return false;
	}
	
	public boolean devolver(String dataFim, int diasAlugados) {
		if(!carro.isDisponivel() && cliente.isTemAluguel()) {
			this.carro.devolvido();
			this.cliente.devolver();
			
			this.calcularValorTotal(diasAlugados);
			System.out.println("Valor total do aluguel: $"+this.valorTotal);
			System.out.println("Carro devolvido com sucesso!");
			return true;
		}
		System.out.println("Erro ao devolver carro!");
		return false;
	}
	
	private void calcularValorTotal(int diasAlugados) {
		this.valorTotal = diasAlugados * this.carro.getPreco();
	}
	
}
