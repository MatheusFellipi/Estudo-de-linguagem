//#include <iostream>
//
////void Swap(int *indA,int *indB)
////{
////	int temp = *indA;
////	*indA = *indB;
////	*indB = temp;
////}
//
///*void bubbleSort(int a[], int tamanho)
//{
//	int i, j;
//
//	for (i = 0; i < tamanho - 1; i++)
//		for (j = 0; j < tamanho - i - 1; j++)
//			if (a[j] > a[j + 1])
//				Swap(&a[j], &a[j + 1]);
//
//}*/	
//
//void bubbleSort(int a[], int tamanho)
//{
//	int i, j,temp;
//
//	for (i = 0; i < tamanho - 1; i++)
//		for (j = 0; j < tamanho - i - 1; j++)
//			if (a[j] > a[j + 1]) {
//				temp = a[j];
//				a[j] = a[j + 1];
//				a[j + 1] = temp;
//			}
//}
//
//void bubblesortRecusiva(int a[], int tamanho)
//{
//	if (tamanho == 1)
//		return;
//
//	for (int i = 0; i < tamanho; i++)
//	{
//		if (a[i]>a[i+1])
//		{
//			int temp = a[i];
//			a[i] = a[i + 1];
//			a[i + 1] = temp;
//		}
//	}
//	bubblesortRecusiva(a, tamanho - 1);
//}
//void ImprimirArranjo(int *a, int tamanho)
//{
//	for (size_t i = 0; i < tamanho; i++)
//	{
//		std::cout<<a[i]<< " " << std::endl;
//	}
//}
//
//int main()
//{
//	int a[] = { 5,7,89,51,39,45,94,1465,48,555,55,55,1,1,1,-1 };
//	int tamanho = sizeof(a) / sizeof(a[0]);
//
//	//bubbleSort(a, tamanho);
//	bubblesortRecusiva(a, tamanho);
//	ImprimirArranjo(a, tamanho);
//}