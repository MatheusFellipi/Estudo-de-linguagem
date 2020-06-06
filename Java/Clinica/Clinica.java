import java.util.ArrayList;

/**
 * Clinica
 */
public class Clinica extends PessoaJuritica {

    private String crm;
    ArrayList<Funcionario> funcionarios;


    public Clinica(String crm, ArrayList<Funcionario> funcionarios,String nome,
    String telefone,String endereco,String cnpj) {
        super(nome, telefone, endereco, cnpj);
        this.crm = crm;
        this.funcionarios = new ArrayList<Funcionario>();
    }


    public String getCRM() {
        return this.crm;
    }

    public void setCRM(String CRM) {
        this.crm = CRM;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return this.funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void addFuncionario(Funcionario funcionarios)
    {
        this.funcionarios.add(funcionarios);
    }
    public boolean removerFuncionario(Funcionario funcionarios) {

        return this.funcionarios.remove(funcionarios);
          
        
       
    }
}