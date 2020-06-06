

/**
 * Pintura
 */
public class Pintura extends ObraDeArte {

    private String tipoDeTinta;
    private String materialUsado;
    private String estiloDeArte;


    public Pintura(String tipoDeTinta, String materialUsado, String estiloDeArte,
    String titulo,int codigo,String anoDeCriacao,String descricao,boolean estaEmExposicao)
    {
        super(titulo, codigo, anoDeCriacao, descricao, estaEmExposicao);
        this.tipoDeTinta = tipoDeTinta;
        this.materialUsado = materialUsado;
        this.estiloDeArte = estiloDeArte;
    }

    public String getTipoDeTinta() {
        return this.tipoDeTinta;
    }

    public void setTipoDeTinta(String tipoDeTinta) {
        this.tipoDeTinta = tipoDeTinta;
    }

    public String getMaterialUsado() {
        return this.materialUsado;
    }

    public void setMaterialUsado(String materialUsado) {
        this.materialUsado = materialUsado;
    }

    public String getEstiloDeArte() {
        return this.estiloDeArte;
    }

    public void setEstiloDeArte(String estiloDeArte) {
        this.estiloDeArte = estiloDeArte;
    }
    
}