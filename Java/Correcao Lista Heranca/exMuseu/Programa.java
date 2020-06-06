package exMuseu;

public class Programa {
	public static void main(String[] args) {
		Artista artista = new Artista("Marcel", "Gótico", "Brazuca", "Antigo", "descrição pra que?" );
		
		Pintura pintura = new Pintura(19, "Monalisa", artista, 1900, "Mulher olhando pro nada", "BR", "antigamente", "guache", "madeira", "pincel");
		//Criar vários objetos para adicionar nas exposições
		//Tarefa pra vocês =D
		
		Exposicao expo1 = new Exposicao("Expo1", "21/12/2019", "31/12/2019");
		expo1.addObraArte(pintura); //Dará tudo certo
		
		Exposicao expo2 = new Exposicao("Expo2", "01/01/2020", "01/02/2020");
		expo2.addObraArte(pintura);//Não dará certo pois a pintura já está em uma exposição
		//Futuramente pode-se conferir as datas para não ter choques. (usando classe Date)
	
	}
}
