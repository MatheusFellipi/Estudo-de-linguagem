//#include <iostream>
//#include <iso646.h>
//
//bool buscaInterativa(struct No* raiz, int valor);
//void posOrder(struct No* root);
//
//struct No
//{
//	int key;
//	struct No* esquerda;
//	struct No* direita;
//};
//
//
//struct No* novoNo(int data)
//{
//	struct No* no = new No;
//	no->key = data;
//	no->esquerda = NULL;
//	no->direita = NULL;
//	return(no);
//}
//
//struct No* menor(struct No* no)
//{
//	struct No* atual = no;
//
//	while (atual->esquerda != NULL)
//		atual = atual->esquerda;
//
//	return atual;
//}
//
//struct No* InserirNo(struct No* no, int key)
//{
//	for (size_t i = 0; i < key; i++)
//	{
//		bool NunExiste = buscaInterativa(no, key);
//		if (NunExiste == true || menor(no)->key < key) {
//
//			std::cout << "horario reservado" << key <<"ou horario menor que:"  <<menor(no)->key<< std::endl;
//			break;
//		}
//		else
//		{
//			if (no == NULL) return novoNo(key);
//			if (key < no->key) no->esquerda = InserirNo(no->esquerda, key);
//			else no->direita = InserirNo(no->direita, key);
//			return no;
//		}
//	}	
//};
//
//bool buscaInterativa(struct No* raiz,int valor)
//{
//	while (raiz != NULL)
//	{
//		if (valor > raiz->key)
//			raiz = raiz->direita;
//		else if (valor < raiz->key)
//			raiz = raiz->esquerda;
//		else
//			return true;
//
//	}
//	return false;
//}
//
//
//void posOrder(struct No* root)
//{
//	if (root != NULL)
//	{
//		std::cout << root->key << " ";
//		posOrder(root->direita);
//		posOrder(root->esquerda);
//
//	}
//}
//
//
//int main()
//{
//	struct No* root = novoNo(20);
//	
//	InserirNo(root, 9);
//	InserirNo(root, 21);
//	InserirNo(root, 1);
//	InserirNo(root, 30);
//
//	posOrder(root);
//}