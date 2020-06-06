/**
 * Estatuario
 */
public class Estatuario extends Escultura{

    private String homenageado;


    public Estatuario(String homenageado,String material,String estilo,double peso,double altura,String titulo,
    int codigo,String anoDeCriacao,String descricao,boolean estaEmExposicao){
        super(material, estilo, peso, altura, titulo, codigo, anoDeCriacao, descricao, estaEmExposicao);
        this.homenageado = homenageado;
    }

    public String getHomenageado() {
        return this.homenageado;
    }

    public void setHomenageado(String homenageado) {
        this.homenageado = homenageado;
    }
    
}