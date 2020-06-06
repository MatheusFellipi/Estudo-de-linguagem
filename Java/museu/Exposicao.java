    
    
    /**
     * Exposicao
     */
    public class Exposicao {
    
        private Pintura pintura;
        private Outros outros;
        private Escultura escultura;
        private Estatuario estatuario;
    
        private String nomeDaExposicao;
        private String dataInicio;
        private String dataFim;
    
    public boolean inicioExposicao(Pintura pintura,Outros outros,
    Escultura escultura,Estatuario estatuario,String nomeDaExposicao,String dataInicio) {
    
        if (pintura.isEstaEmExposicao() && outros.isEstaEmExposicao()
         && escultura.isEstaEmExposicao()&&estatuario.isEstaEmExposicao()){
    
                this.nomeDaExposicao=nomeDaExposicao;
                this.pintura=pintura;
                this.escultura=escultura;
                this.outros=outros;
                this.estatuario=estatuario;
                this.dataInicio=dataInicio;
    
    
                this.pintura.disponivel();
                this.escultura.disponivel();
                this.outros.disponivel();
                this.estatuario.disponivel();
            
            System.out.println("exposiçao aberta"); 
            return true;
        }
        System.out.println("exposiçao nao aberta, obras nao disponivel");
        return false;
       
    }
    
    public boolean fimDaExposicao(Pintura pintura,Outros outros,
    Escultura escultura,Estatuario estatuario,String nomeDaExposicao,String dataFim)
    {
        if(!pintura.isEstaEmExposicao() && !outros.isEstaEmExposicao()
        && !escultura.isEstaEmExposicao()&&!estatuario.isEstaEmExposicao()){
    
            this.nomeDaExposicao=nomeDaExposicao;
            this.pintura=pintura;
            this.escultura=escultura;
            this.outros=outros;
            this.estatuario=estatuario;
            this.dataFim=dataFim;
    
    
            this.pintura.naoDisponivel();
            this.escultura.naoDisponivel();
            this.outros.naoDisponivel();
            this.estatuario.naoDisponivel();
    
            System.out.println("exposiçao fechada,devolvido todas as obras");
            return true;
        }
        System.out.println("exposiça nao esta fechada,obras nao devolvida");
        return false;
    }
    }
   
    
