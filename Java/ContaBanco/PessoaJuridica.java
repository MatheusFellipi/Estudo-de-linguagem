/**
 * PessoaJuridica
 */
public class PessoaJuridica extends Pessoa {

    private String cnpj;


    public PessoaJuridica(String cnpj,String cpf,int nroConta) {
        super(cpf,nroConta);
        this.cnpj = cnpj;

    }

    public String getCnpj() {
        return this.cnpj;
    }
    
    public void setCnpj(String cnpj) {
        if(validarCNPJ(cnpj))
        this.cnpj = cnpj;
    }
    
    private boolean validarCNPJ(String cnpj)
    {
        if (this.cnpj.length()==11){
            return true;
            
        } else {
            return false;
        }
    }
}