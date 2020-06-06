package exClinica;

public abstract class Funcionario extends PessoaFisica {
	private double salario;

	public Funcionario(String nome, String telefone, String endereco, String cpf, double salario) {
		super(nome, telefone, endereco, cpf);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	} 
	
	
	
}
