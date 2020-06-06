/**
 * Especialidade
 */
public class Especialidade {

    private String nome;
    private String crm;

    public Especialidade(String nome, String crm) {
        this.nome = nome;
        this.crm = crm;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrm() {
        return this.crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

}