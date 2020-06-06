///*------------atividade------------------
//questao 1:Quando um problema pode ser resolvido (eficientemente) com
//Divis ̃ao e Conquista?
//o divisao de Conquista e quando e possivel aplicar uma problema grande e dividir um problema menor.
//Busca binaria pelo o fato de ele dividir a array ordenada para buscar um elemento eleminando a metade do array, fazendo a verrificaçao
//do elemento de busca com o elemento apontado atual.
//
//questao 2:
//N^2 insert sort > pior caso
//n(log n) mergeSort >pior caso
//
//No pior caso o insertion sort vai ser melhor que o merge sort 
//ja no melhor caso o mergersort vai ser pior.
//
//*/
//#include <iostream>
//
//int mergerSort(int *A, int min, int max);
//void merger(int *A, int min, int meio, int max);
//
//int main()
//{
//	int A[] = { 5,9,6,3,12,45,78,-5,31,56,48,21,85,12,4,
//	85,21,20,74,55,-1,0,-2,6,6,6 };
//	
//	int tamanho = sizeof(A) / sizeof(A[0]);
//	int Primeiro = A[0];
//	int Ultimo = A[tamanho - 1];
//	int meio = 0;
//	
//	mergerSort(A,Primeiro,Ultimo);
//	
//	//ordenacaoInsercao(A,tamanho);
//
//
//}
//
//void merger(int *A,int Primeiro,int meio,int Ultimo)
//{
//	int *temp,p1,p2, i, j, k;
//	int fim1 = 0, fim2 = 0;
//	int tamanho = Ultimo - Primeiro + 1;
//
//	p1 = Primeiro;
//	p2 = meio + 1;
//	temp = (int *)malloc(tamanho * sizeof(int));
//
//	if (temp != NULL)
//	{
//		for (i = 0; i < tamanho; i++)   //o sentinela e necessario para nao percorrer o vetor todo fazendo comparaçao desnecessaria.
//		{
//			if (!fim1 && !fim2) {
//				if (A[p1] && !A[p2])
//					temp[i] = A[p1++];
//				else
//					temp[i] = A[p2++];
//
//				if (p1 > meio) fim1 = 1;   
//				if (p2 > Ultimo)fim2 = 1;
//			}
//			else
//			{
//				if (!fim1) temp[i] = A[p1++];
//				else temp[i] = A[p2++];
//			}
//			
//		}
//	}
//
//	for (j = 0, k = Primeiro; j < tamanho; j++, k++)
//	{
//		A[k] = temp[j];
//	}
//	free(temp);	
//}
//
//int mergerSort(int *A, int min, int max)
//{
//	int meio;
//	if (min < max)
//	{
//		meio = (min + max) / 2;
//		return mergerSort(A, min, meio);
//		return mergerSort(A, meio + 1, max);
//
//		return merger(A, min, meio, max);
//	}
//}
//
