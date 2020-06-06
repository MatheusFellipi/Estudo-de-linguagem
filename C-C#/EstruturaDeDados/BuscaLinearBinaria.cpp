////BuscaLinearBinaria.cpp : This file contains the 'main' function. Program execution begins and ends there.
//
//#include <iostream>
//using namespace std;
//
////minhas fuçoes.
//int buscaLinearRecusiva(int A[], int numBusca, int i,int tamanho);
//int buscaLinearInterativa(int A[], int numBusca, int Tamanho);	  
//int buscaBinariaInterativa(int A[],int numBusca,int tamanho);
//int buscaBinariaRecursiva(int A[], int min, int max, int numBusca, int tamanho);
//int numeroFaltando(int A[], int tamnho);
//
//
//int main()
//{
//	int A[] = { 1,2,3,4,5,6 };
//	int numBusca = 8;
//	int Tamanho = sizeof(A) / sizeof(A[0]);
//
//	int resultadoInterativaLinear = buscaLinearInterativa(A, numBusca, Tamanho);
//	int resultadoRecursivoLinear = buscaLinearRecusiva(A, numBusca, 0,Tamanho);
//	int resultadoInterativaBinaria=buscaBinariaInterativa(A,numBusca,Tamanho);
//	int resultadoRecursivoBinario= buscaBinariaRecursiva(A, 0, Tamanho-1, numBusca, Tamanho);
//	int resultadoNumeroFaltando= numeroFaltando(A, Tamanho);
//
//	cout << "-----Interativa Linear----\n";
//		(resultadoInterativaLinear == -1)
//			? cout << "elemento nao se encontra no array"
//			: cout << "elemento na posicao : " << resultadoInterativaLinear;
//
//	cout << "\n----Recursiva Linear-----\n";
//		(resultadoRecursivoLinear == -1)
//			? cout << "elemento nao se encontra no array"
//			: cout << "elemento na posicao : " << resultadoRecursivoLinear;
//
//	cout << "\n ------Interativa Binaria-------\n";
//		(resultadoRecursivoLinear == -1)
//			? cout << "elemento nao se encontra no array"
//			: cout << "elemento na posicao : "<< resultadoInterativaBinaria;
//
//	cout << "\n ------Interativa recursiva-------\n";
//		(resultadoRecursivoLinear == -1)
//			? cout << "elemento nao se encontra no array"
//			: cout << "elemento na posicao : " << resultadoRecursivoLinear;
//	cout << "\nNumero Faltando\n";
//	cout << resultadoNumeroFaltando;
//
//	return 0;
//}
//
//int buscaLinearInterativa(int A[], int numBusca, int Tamanho)
//{
//	int i;
//	for (i = 0; i < Tamanho; i++) 
//	{
//		if (A[i] == numBusca)
//			return i;
//	}
//	return -1;
//}
//
//int buscaLinearRecusiva(int A[], int numBusca, int i,int tamanho)
//{
//	if (i >= tamanho) return -1;
//
//	if (A[i] == numBusca) return i;
//	else return buscaLinearRecusiva(A, numBusca, i + 1, tamanho);
//
//
//}
//
//int buscaBinariaInterativa(int A[], int numBusca, int tamanho)
//{
//
//	int min = 0;
//	int max = tamanho - 1;
//	int meio;
//	
//	while (max > min)
//	{
//		meio = floor(max - min / 2);
//		
//		if (A[meio] == numBusca) return meio;
//
//		else if (A[meio] < numBusca) 
//		{ 
//			min = meio + 1;
//		}
//		else
//		{
//			max = meio - 1;
//		}
//		
//
//	}
//
//	return -1;
//		
//}
//
//int buscaBinariaRecursiva(int A[],int min ,int max ,int numBusca, int tamanho)
//{
//	if (max > min)
//	{	
//		int meio = floor(max - min / 2);
//
//		if (A[meio] > numBusca)
//			return meio;
//
//		if (A[meio] < numBusca)
//			return buscaBinariaRecursiva(A, min, meio - 1, numBusca, tamanho);
//			
//		return buscaBinariaRecursiva(A, meio + 1, max, numBusca, tamanho);
//	}
//	return -1;
//}
//int numeroFaltando(int A[], int tamnho)
//{
//	int total = (tamnho + 1) * (tamnho + 2) / 2;
//
//	for (int i = 0; i < tamnho; i++)
//		total -= A[i];
//
//	return total;
//
//}