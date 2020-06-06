/**
 * PessoaJuritica
 */
public class PessoaJuritica {
   
    private String nome;
    private String telefone;
    private String endereco;
    private String cnpj;



    public PessoaJuritica(String nome, String telefone, String endereco, String cnpj) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cnpj = cnpj;
    }
   

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
}