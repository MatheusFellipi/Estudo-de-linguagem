/**
 * PessoaFisica
 */
public class PessoaFisica extends Pessoa{


    public PessoaFisica(String nome,String cpf,int nroConta) {
        super(nome, cpf, nroConta);
    }

    public PessoaFisica(String cpf,int nroConta) {
        super(cpf, nroConta);
    }
    

}