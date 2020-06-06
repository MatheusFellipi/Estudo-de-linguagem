/**
 * Conta
 */
public class Conta {

    private Pessoa pessoa;
    private double saldo;



    public Conta(Pessoa pessoa, double saldo) {
        this.pessoa = pessoa;
        this.saldo = 0;
    }


    public Conta(double saldo) {
        this.saldo = 0;
    }

    public Pessoa getPessoa() {
        return this.pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = 0;
    }

    public boolean sacar(double valor)
    {
        if (valor <= this.saldo) {
            this.saldo = this.saldo - valor;
            System.out.println("saca realizando dom sucesso");
            return true;
            
        } else {
            System.out.println("saque invalido");
            return false;
        }
    }

    public boolean deposito(double valor)
    {
        if (valor>0) {
            this.saldo += valor;
            System.out.println("depodito realizado com sucesso");
            return true;
            
        } else {
            System.out.println("deposito invalido , so pode deposita acima de 0");
            return false;
        }
    }

  
}