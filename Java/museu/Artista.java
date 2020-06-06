

/**
 * Artista
 */
public class Artista {

   private String nome;
   private String paisOrigem;
   private String dataNascimento;
   private String dataMorte;
   private String estiloDeArte;
   private String PeriodoArtistico;
   private String descricao;


    public Artista(String nome, String dataNascimento, String dataMorte, String estiloDeArte, String PeriodoArtistico, String descricao) {
       
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.dataMorte = dataMorte;
        this.estiloDeArte = estiloDeArte;
        this.PeriodoArtistico = PeriodoArtistico;
        this.descricao = descricao;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDataMorte() {
        return this.dataMorte;
    }

    public void setDataMorte(String dataMorte) {
        this.dataMorte = dataMorte;
    }

    public String getEstiloDeArte() {
        return this.estiloDeArte;
    }

    public void setEstiloDeArte(String estiloDeArte) {
        this.estiloDeArte = estiloDeArte;
    }

    public String getPeriodoArtistico() {
        return this.PeriodoArtistico;
    }

    public void setPeriodoArtistico(String PeriodoArtistico) {
        this.PeriodoArtistico = PeriodoArtistico;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPaisOrigem() {
        return this.paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }
    
    

}