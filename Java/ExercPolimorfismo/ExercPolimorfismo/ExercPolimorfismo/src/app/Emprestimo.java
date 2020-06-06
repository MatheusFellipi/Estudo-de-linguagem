package app;

import java.util.Calendar;
import java.util.Date;

public class Emprestimo {
    private Usuario usuario;
    private Publicacao publicacao;
    private Date dataEmprestimo;
    private Date dataPossivelEntrega;
    private Date dataEntrega;
    private double valorMulta;
    private int qtdRenovacoes;

    public Emprestimo(Usuario usuario, Publicacao publicacao) throws LimiteEmprestimosException, PublicacaoNaoDisponivelException {
        if(publicacao.isDisponivel()){
            if(usuario.addNovoEmprestimo()){
                this.usuario = usuario;
                this.publicacao = publicacao;
                //Criar o objeto date utiliza-se a data e horário no momento da criação do objeto
                this.dataEmprestimo = new Date();
                //Adiciona-se 7 dias para a possível entrega (prazo de entrega)
                this.dataPossivelEntrega = this.addSeteDias(this.dataEmprestimo);
                this.qtdRenovacoes = 0;
                System.out.println("Emprestimo realizado com sucesso!");
            }else{
                //Excecao usuário atingiu limite de emprestimos
                throw new LimiteEmprestimosException("Limite de emprestimos permitidos para o usuário atingido!"); 
            }
        }else{
            //Excecao Publicacao Não disponível
            throw new PublicacaoNaoDisponivelException("A publicação não está disponível para emprestimo!");
        }
    }

    public boolean renovarEmprestimo() throws LimiteRenovacoesException, RenovacaoForaPrazoException {
        Date dataRenovacao = new Date();
        if(dataRenovacao.getTime() <= this.dataPossivelEntrega.getTime()){
            if (this.qtdRenovacoes < this.usuario.getNroMaximoRenovacoes()) {
                this.qtdRenovacoes++;
                this.dataPossivelEntrega = this.addSeteDias(dataRenovacao);
                return true;
            } else {
                // Excessao nro máximo de renovações já ultrapassada
                throw new LimiteRenovacoesException("O usuário atingiu a cota de renovações permitidas!");
            }
        }else{
            //Excessao renovação fora do prazo permitido
            throw new RenovacaoForaPrazoException("A renovação não é permitida pois está fora do prazo de permitido!");
        }
    }

    public void finalizarEmprestimo(){
        this.dataEntrega = new Date();
        if(this.dataEntrega.getTime() <= this.dataPossivelEntrega.getTime()){
            this.valorMulta = 0;
            System.out.println("Emprestimo finalizado com sucesso! Não foi gerado multa!");
        }else{
            double diferencaDias = Math.ceil((this.dataEntrega.getTime() - this.dataPossivelEntrega.getTime())/(24*60*60*1000));
            this.valorMulta = diferencaDias * this.publicacao.getValorMulta();
            System.out.println("Emprestimo finalizado com sucesso! O valor da multa é de R$"+this.valorMulta);
        }
        //Realizar a entrega da publicacao e informar que o cliente finalizou o emprestimo
        this.publicacao.devolverPublicacao();
        this.usuario.devolverEmprestimo();
    }

    private Date addSeteDias(Date data){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);
        calendar.set(Calendar.DAY_OF_MONTH, calendar.get(Calendar.DAY_OF_MONTH)+7);
        return calendar.getTime();
    }

}