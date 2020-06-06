package app;

import java.util.Date;

public class Tese extends Publicacao{
    private String resumo;
    private int nroPaginas;
    private Date dataDefesa;
    private String instituicao;

    public Tese(String titulo, Date dataPublicacao, String resumo, int nroPaginas,
                Date dataDefesa, String instituicao, double valorMulta) {
        super(titulo, dataPublicacao, valorMulta);
        this.resumo = resumo;
        this.dataDefesa = dataDefesa;
        this.nroPaginas = nroPaginas;
        this.instituicao = instituicao;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public int getNroPaginas() {
        return nroPaginas;
    }

    public void setNroPaginas(int nroPaginas) {
        this.nroPaginas = nroPaginas;
    }

    public Date getDataDefesa() {
        return dataDefesa;
    }

    public void setDataDefesa(Date dataDefesa) {
        this.dataDefesa = dataDefesa;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }  

    //Permite somente um autor por tese, controle feito pelo método
    @Override
    public boolean addAutor(Autor autor){
        if(super.getAutores().size() == 0){
            return super.getAutores().add(autor);
        }
        System.out.println("Não é possivel adicionar novo autor em tese!");
        return false;
    }
}