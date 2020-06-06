package app;

import java.util.Date;

public class Livro extends Publicacao {
    private int edicao;
    private String editora;
    private String isbn;

    public Livro(String titulo, Date dataPublicacao, int edicao, String editora, String isbn, double valorMulta) {
        super(titulo, dataPublicacao, valorMulta);
        this.edicao = edicao;
        this.editora = editora;
        this.isbn = isbn;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    

}