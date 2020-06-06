//#include<iostream>
//#include <queue>
//
//#pragma region Struct No
////
////struct No
////{
////	int key;
////	struct No* esquerda;
////	struct No* direita;
////};
////
//
//struct No
//{
//	int key;
//	struct No* esquerda;
//	struct No* direita;
//	int altura;
//	int fatorB;
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
//struct No* InserirNo(struct No* no,int key)
//{
//	if (no == NULL) return novoNo(key);
//	if (key < no->key) no->esquerda = InserirNo(no->esquerda, key);
//	else no->direita = InserirNo(no->direita, key);
//	return no;
//};
//
//struct No* apagarNo(struct No* raiz,int valor)
//{
//	if (raiz == NULL) return raiz;
//	if (valor < raiz->key) 
//		raiz->esquerda = apagarNo(raiz->esquerda, valor);
//	else if (valor > raiz->key) 
//		raiz->direita = apagarNo(raiz->direita, valor);
//	else
//	{
//		if (raiz->esquerda==NULL)
//		{
//			struct No* temp = raiz->direita;
//			free(raiz);
//			return temp;
//			
//		}
//		else if(raiz->direita == NULL)
//		{
//			struct No* temp = raiz->esquerda;
//			free(raiz);
//			return temp;
//		}
//		struct No* temp = InorderSucessor(raiz->direita);
//		raiz->key = temp->key;
//		raiz->direita = apagarNo(raiz->direita, temp->key);
//	}
//
//};
//
//struct No*giraEsquerda(struct No* T)
//{
//	struct No* n2 = T->direita;
//	struct No* n3 = n2->esquerda;
//	n2->esquerda = T;
//	T ->direita = n3;
//	T->altura = max(altura(T->esquerda),
//		altura(T->direita)) + 1;
//	n2->altura = max(altura(n2->esquerda),
//		altura(n2->direita)) + 1;
//
//	return n2;
//
//};
//#pragma endregion
//
//#pragma region SucesorInd
//struct No* InorderSucessor(struct No* root)
//{
//	struct No* atual = root;
//	while(atual->esquerda != NULL)
//	{	
//		atual = atual->esquerda;
//
//		return atual->esquerda;
//	}
//}
//#pragma endregion
//
//
//#pragma region Imprimir Arvore
//
//void LevelOrder(No* raiz)
//{
//	if (raiz == NULL) return;
//
//	std::queue<No*> Q;
//	Q.push(raiz);
//	while (Q.empty() == false)
//	{
//		int qtdNos = Q.size();
//		while (qtdNos > 0)
//		{
//			No* no = Q.front();
//			std::cout << no->key << " ";
//			Q.pop();
//			if (no->esquerda != NULL)
//				Q.push(no->esquerda);
//
//			if (no->direita != NULL)
//				Q.push(no->direita);
//			qtdNos--;
//		}
//		std::cout << std::endl;
//	}
//}
//
//void preOrder(struct No* root)
//{
//	if (root != NULL)
//	{
//		std::cout << root->key << " ";
//		preOrder(root->esquerda);
//		preOrder(root->direita);
//	}
//}
//
//void inOrder(struct No* root)
//{
//	if (root != NULL)
//	{
//		inOrder(root->esquerda);
//		std::cout << root->key << " ";
//		inOrder(root->direita);
//	}
//}
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
//#pragma endregion
//
//
//#pragma region Busca
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
//void buscaPosOrdem(struct No* root, int numbusca)
//{
//	if (root != NULL)
//	{
//		int atual = root->key;
//		if (atual == numbusca)
//			std::cout << "elemento na lista";
//		else {
//			buscaPosOrdem(root->direita, numbusca);
//			buscaPosOrdem(root->esquerda, numbusca);
//		}
//	}
//}
//
//
//#pragma endregion
//
//
//
//
//
//int main()
//{
//#pragma region valores
//	struct No* root = novoNo(1);
//
//	root->esquerda = novoNo(1);
//	root->direita = novoNo(9);
//	root->esquerda->esquerda = novoNo(4);
//	root->direita->esquerda = novoNo(3);
//#pragma endregion
//
//
//
//	std::cout << "pre_order" << std::endl;
//	preOrder(root);
//
//
//	std::cout << "\n";
//	std::cout << "pos_order" << std::endl;
//	posOrder(root);
//
//	std::cout << "\n";
//	std::cout << "busca Pos ordem "<< std::endl;
//	int numbusba = 2;
//	buscaPosOrdem(root, numbusba);
//
//	return 0;
//}