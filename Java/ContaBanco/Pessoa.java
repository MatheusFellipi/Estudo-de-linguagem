/**
 * Pessoa
 */
public class Pessoa {

    private String nome;
    private String  cpf;
    private int nroConta;


    public Pessoa(String nome, String cpf, int nroConta) {
        this.nome = nome;
        this.cpf = cpf;
        this.nroConta = nroConta;
    }

    public Pessoa(String cpf, int nroConta) {
        this.cpf = cpf;
        this.nroConta = nroConta;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getNroConta() {
        return this.nroConta;
    }

    public void setNroConta(int nroConta) {
        this.nroConta = nroConta;
    }

    
}