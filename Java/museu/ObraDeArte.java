

/**
 * ObraDeArte
 */
public abstract class ObraDeArte{

    private String titulo;
    private int codigo;
    private String anoDeCriacao;
    private String descricao;
    private String pais;
    private String periodo;
    private Artista artista;
    

    public ObraDeArte(String titulo, int codigo, String anoDeCriacao, String descricao, String pais, String periodo, Artista artista) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.anoDeCriacao = anoDeCriacao;
        this.descricao = descricao;
        this.pais = pais;
        this.periodo = periodo;
        this.artista = artista;
    }


    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getAnoDeCriacao() {
        return this.anoDeCriacao;
    }

    public void setAnoDeCriacao(String anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPeriodo() {
        return this.periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public Artista getArtista() {
        return this.artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }
   
    
}
   