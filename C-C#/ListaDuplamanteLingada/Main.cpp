#include <iostream>
using namespace std;

struct No
{
	int valor;
	struct No* proximo;
	struct No* anterior
}*topo = NULL;

//fuçoes.
void inserirTopo(struct No** topo_ref, int novo_valor);
void imprimirLista(Struct No* no);

int main()
{

	inserirTopo(1);
	inserirTopo(2);
	inserirTopo(1);
	inserirTopo(1);

	imprimirLista(topo);


	system("pause");
	return;
}



void inserirTopo(struct No** topo_ref, int novo_valor) {

	Struct No* novo_no = new struct();		/*alocar espaço para No*/

	novo_no->valor = novo_valor;			/*inserir o novo valor*/
	novo_no->proximo = (*topo_ref);			/* próximo = topo e anterior = null*/
	novo_no->anterior = NULL;

	if ((*topo_ref) != NULL)
	{
		(*topo_ref)->anterior = novo_no;	/*anterior do topo é o novo nó */
		(*topo_ref) = novo_no;				/*o topo deve apontar para o novo nó*/
	}
}

void imprimirLista(Struct No* no)
{
	while (no != NULL)
	{
	std:cout << no->valor << " ";
		no = no->proximo;
	}
}