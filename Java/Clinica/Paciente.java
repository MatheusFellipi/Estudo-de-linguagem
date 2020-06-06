/**
 * Paciente
 */
public class Paciente extends PessoaFisica{
    private String profissao;
    private String dtNascimento;

    public Paciente(String profissao, String dtNascimento,String nome,String telefone,String endereco,String cpf) {
        super(nome, telefone, endereco,cpf);
        this.profissao = profissao;
        this.dtNascimento = dtNascimento;
    }

    public String getProfissao() {
        return this.profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getDtNascimento() {
        return this.dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

}