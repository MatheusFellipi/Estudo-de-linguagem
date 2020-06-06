package app;
import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private String endereco;
    private ArrayList<Publicacao> publicacoes;

    public Biblioteca(String nome, String endereco){
        super();
        this.endereco = endereco;
        this.publicacoes = new ArrayList<Publicacao>();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Publicacao> getPublicacoes() {
        return publicacoes;
    }

    public void setPublicacoes(ArrayList<Publicacao> publicacoes) {
        this.publicacoes = publicacoes;
    }

    public boolean addPublicacao(Publicacao publicacao){
        return this.publicacoes.add(publicacao);
    }
    
    public boolean removePublicacao(Publicacao publicacao){
        return this.publicacoes.remove(publicacao);
    }
   
}