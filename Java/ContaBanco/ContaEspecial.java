/**
 * ContaEspecial
 */
public class ContaEspecial extends Conta {

    private double chegueSpecial;
    private PessoaJuridica pessoaJuridica;
  


    public ContaEspecial(double chegueSpecial, PessoaJuridica pessoaJuridica,double saldo) {
        super(saldo);
        this.chegueSpecial = chegueSpecial;
        this.pessoaJuridica = pessoaJuridica;
    }


    public double getChegueSpecial() {
        return this.chegueSpecial;
    }

    public void setChegueSpecial(double chegueSpecial) {
        this.chegueSpecial = chegueSpecial;
    }

    public boolean DepositarChegueSpecial()
    {
        if (this.chegueSpecial>0) {
            super.setSaldo(getSaldo() + chegueSpecial);
            System.out.println("cheque depositado");
            return true;
        } else {
            System.out.println("deposito invalido");
            return false;
        }

    }
    public boolean sacarContaEspecial(double valor)
    {
        if (this.chegueSpecial > 0 && super.getSaldo() > 0) {
            super.setSaldo((this.getSaldo() + chegueSpecial) - getSaldo());
           return true;
        }else 
            return false;

    }


}