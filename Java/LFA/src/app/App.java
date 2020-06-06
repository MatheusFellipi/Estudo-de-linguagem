package app;

import javax.swing.JOptionPane;

/**
 *
 * @author IFGoiano
 */
public class App {

    int[][] trasicao;
   // static int estadoInicial=0;
   
    
    public static void main(String[] args) {

        

            int qdtDeAlfabeto=Integer.parseInt(JOptionPane.showInputDialog("entre com a quandidade de alfabeto"));//columa
            int estadoInicial = Integer.parseInt(JOptionPane.showInputDialog("digite o estado inicia"));
            int qtdDeAceitacao=Integer.parseInt(JOptionPane.showInputDialog("quando estado de aceitaçao"));
            
            int[] aceitacao=new int [qtdDeAceitacao];
            for(int i=0; i <qtdDeAceitacao; i++)
            {
                aceitacao[i]=Integer.parseInt(JOptionPane.showInputDialog("entre com os estado de aceitaçao"));
            }
            
            int qdtDeEstado=Integer.parseInt(JOptionPane.showInputDialog("entre com a quandidade de estados"));
            int[][] trasicao={{0,0},{0,0}};
            for (int i=0; i <qdtDeAlfabeto; i++){
                for(int j=0;j<qdtDeEstado;j++){
                    trasicao[i][j]=Integer.parseInt(JOptionPane.showInputDialog("digite o estado para linha" + i + " coluna" + j + " "));
                }
            }

            while(true){
               String cadeia= JOptionPane.showInputDialog("digite a cadea");
               int estado=estadoInicial;
               int posicao=0;
               
               while (posicao <cadeia.length())
               {
                   imprimir();
                   
                   char elemento = cadeia.charAt(posicao); 
                   imprimir();
                   int elementoInt= Integer.parseInt(elemento+"");
                   imprimir();
                   estado=trasicao[estado][elementoInt];
                   
                   posicao++;
               }
               imprimir();
               
               boolean aceito=false;
               for(int i:aceitacao){
                   
                   if(estado==i)
                   {
                       aceito=true;
                   }
               }
                if (aceito)
                       System.out.println("aceito");
                   else 
                       System.out.println("nao aceito");

                       String oPtion = JOptionPane.showInputDialog("deseja testar outra cadeia Qualquer teclara para comtinua ou N ");
                if(oPtion == "N" || oPtion == "n" )
                {
                    break;
                }

        }
   
    }

    public static void imprimir(){
        System.out.println("");
    } 
}