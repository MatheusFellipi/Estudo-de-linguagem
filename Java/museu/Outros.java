/**
 * Outros
 */
public class Outros extends ObraDeArte{



    private String tipoDeArte;
    private String estiloDeArte;



    public Outros(String tipoDeArte, String estiloDeArte,String titulo,int codigo,String anoDeCriacao,String descricao,String pais,String periodo,String artista) {
        super(titulo, codigo, anoDeCriacao, descricao, pais, periodo, artista);
        this.tipoDeArte = tipoDeArte;
        this.estiloDeArte = estiloDeArte;
    }


    public String getTipoDeArte() {
        return this.tipoDeArte;
    }

    public void setTipoDeArte(String tipoDeArte) {
        this.tipoDeArte = tipoDeArte;
    }

    public String getEstiloDeArte() {
        return this.estiloDeArte;
    }

    public void setEstiloDeArte(String estiloDeArte) {
        this.estiloDeArte = estiloDeArte;
    }
    
}

    