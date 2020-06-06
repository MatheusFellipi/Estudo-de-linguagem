package app;

public abstract class Usuario{
    private String nome;
    private String telefone;
    private String email;
    private String cpf;
    private int nroMaxEmprestimos;
    private int nroMaximoRenovacoes;
    private int nroEmprestimosRealizados;

    public Usuario(String nome, String telefone, String email, String cpf, int nroMaxEmprestimos, int nroMaximoRenovacoes){
        super();
        this.nome = nome;
        this.telefone = telefone; 
        this.email = email; 
        this.cpf = cpf;
        this.nroMaxEmprestimos = nroMaxEmprestimos;
        this.nroMaximoRenovacoes = nroMaximoRenovacoes;
        this.nroEmprestimosRealizados = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getNroMaxEmprestimos() {
        return nroMaxEmprestimos;
    }

    public int getNroMaximoRenovacoes() {
        return nroMaximoRenovacoes;
    }

    public boolean addNovoEmprestimo(){
        if(this.nroEmprestimosRealizados < this.nroMaxEmprestimos || this.nroMaxEmprestimos == -1){
            this.nroEmprestimosRealizados++;
            System.out.println("Emprestimo realizado pelo usuário com sucesso!");
            return true;
        }
        System.out.println("Emprestimo não pode ser realizado pelo usuário!");
        return false;
    }

    public void devolverEmprestimo(){
        System.out.println("Emprestimo devolvido pelo usuário com sucesso!");
        this.nroEmprestimosRealizados--;
    }
  
}