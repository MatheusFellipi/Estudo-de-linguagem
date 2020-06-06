/**
 * museu
 */
public class museu {

    private Artista artista;
    private Exposicao exposicao;

    public museu(Artista artista, Exposicao exposicao) {
        this.artista = artista;
        this.exposicao = exposicao;
    }

    public Exposicao getExposicao() {
        return this.exposicao;
    }

    public void setExposicao(Exposicao exposicao) {
        this.exposicao = exposicao;
    }

    public Artista getArtista() {
        return this.artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

}