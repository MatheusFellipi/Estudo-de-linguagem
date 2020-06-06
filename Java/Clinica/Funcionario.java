/**
 * Funcionario
 */
public abstract class Funcionario extends PessoaFisica {

    private double salario;

    public Funcionario(double salario,String nome,String telefone,String endereco, String cpf) {
        super(nome, telefone, endereco, cpf);
        this.salario = salario;
    }


    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}