/**
 * Escultura
 */
public class Escultura extends ObraDeArte {

    private String material;
    private String estilo;
    private double peso;
    private double altura;


    public Escultura(String material, String estilo, double peso, double altura,
     String titulo,int codigo, String anoDeCriacao,String descricao,boolean estaEmExposicao ) {
        super(titulo, codigo, anoDeCriacao, descricao, estaEmExposicao);
        this.material = material;
        this.estilo = estilo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getEstilo() {
        return this.estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    

    
}