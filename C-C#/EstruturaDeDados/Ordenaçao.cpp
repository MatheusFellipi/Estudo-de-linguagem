//
//#include <iostream>
//using namespace std;
//struct No
//{
//	int valor;
//	struct No* proximo;
//	struct No* anterior;
//
//};
//struct No* topo = NULL;
//
//void ordenacaoInsercao(int vetor[], int tamnaho);
//void ordenacaoInsercaoD(int vetor[], int tamanho);
//
///*questao 2- o pior caso  e codigo realizara mais trocas na ortem inversa crescente
//no melhor caso e na e ja esta na ordenado e o caso medio esta entre os pior caso e o melhor caso*/
//int main()
//{
//	int A[]={5,2,3,4,1,2,6};
//	int Tamanho = sizeof(A) / sizeof(A[0]);
//
//	cout << "vetor ordenado\n";
//	ordenacaoInsercao(A,Tamanho);
//	cout << "\nordem cresente\n";
//	ordenacaoInsercaoD(A, Tamanho);
//
//	cout << "\n pilha \n";
//	
//
//
//	system("Pause");
//	return 0;
//}
//
//void ordenacaoInsercao(int vetor[], int tamanho)
//{
//	int j,i,chave;
//	for (j = 1;j<tamanho;j++)
//	{
//		chave = vetor[j];
//		i = j - 1;
//		while ((i>=0) && (vetor[i]>chave))
//		{
//			vetor[i + 1] = vetor[i];
//			i = i - 1;
//		}
//		vetor[i + 1] = chave;
//	}
//	
//	for (int a = 0; a < tamanho; a++)
//	{
//		cout << vetor[a];
//	}	
//}
//
//
//void ordenacaoInsercaoD(int vetor[], int tamanho)
//{
//	int j, i, chave;
//	for (j = 1; j < tamanho; j++)
//	{
//		chave = vetor[j];
//		i = j - 1;
//		while ((i >= 0) && (vetor[i] < chave))
//		{
//			vetor[i + 1] = vetor[i];
//			i = i - 1;
//		}
//		vetor[i + 1] = chave;
//	}
//
//	for (int a = 0; a < tamanho; a++)
//	{
//		cout << vetor[a];
//	}
//}
//
//
//void inserirTopo(struct No** topo_ref, int novo_valor) {
//
//	struct No* novo_no;
//	novo_no =new struct No;		
//
//	novo_no->valor = novo_valor;			
//	novo_no->proximo = (*topo_ref);			
//	novo_no->anterior = NULL;
//
//	if ((*topo_ref) != NULL)
//	{
//		(*topo_ref)->anterior = novo_no;	
//		(*topo_ref) = novo_no;				
//	}
//}
//
//void imprimirLista(struct No* no)
//{
//	while (no != NULL)
//	{
//	std:cout << no->valor << " ";
//		no = no->proximo;
//	}
//}