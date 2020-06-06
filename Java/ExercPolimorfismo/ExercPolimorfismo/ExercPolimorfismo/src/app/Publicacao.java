package app;

import java.util.ArrayList;
import java.util.Date;

public abstract class Publicacao{
    private String titulo;
    private Date dataPublicacao;
    private ArrayList<Publicacao> referencias;
    private ArrayList<Autor> autores;
    private boolean disponivel;
    private double valorMulta;

    public Publicacao(String titulo, Date dataPublicacao, double valorMulta){
        super();
        this.titulo = titulo;
        this.dataPublicacao = dataPublicacao;
        this.valorMulta = valorMulta;
        this.referencias = new ArrayList<Publicacao>();
        this.autores = new ArrayList<Autor>();
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public ArrayList<Publicacao> getReferencias() {
        return referencias;
    }

    public void setReferencias(ArrayList<Publicacao> referencias) {
        this.referencias = referencias;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }

    public boolean addReferencia(Publicacao referencia) {
        System.out.println("Referência adicionada com sucesso!");
        return this.referencias.add(referencia);
    }

    public boolean removeReferencia(Publicacao referencia) {
        System.out.println("Referência removida com sucesso");
        return this.referencias.remove(referencia);
    }

    public boolean addAutor(Autor autor){
        System.out.println("Autor adicionado com sucesso!");
        return this.autores.add(autor);
    }

    public boolean removeAutor(Autor autor){
        System.out.println("Autor removido com sucesso");
        return this.autores.remove(autor);
    }

    public boolean isDisponivel(){
        return this.disponivel;
    }

    public void emprestarPublicacao(){
        this.disponivel = false;
        System.out.println("Publicação emprestada com sucesso!");
    }

    public void devolverPublicacao(){
        this.disponivel = true;
        System.out.println("Publicação devolvida com sucesso!");
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }

}