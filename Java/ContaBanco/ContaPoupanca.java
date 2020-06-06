/**
 * ContaPooanca
 */
public class ContaPoupanca extends Conta{


    public ContaPoupanca(Pessoa pessoa,double saldo) {
        super(pessoa,saldo);
    }
    

    public void redimendoConda()
    {
        if(super.getSaldo()<0)
        {
            super.getSaldo()= super.getSaldo() * 0.005;
        }
        else
        {
            System.out.println("redimento indisponivel");
        }
    }
}