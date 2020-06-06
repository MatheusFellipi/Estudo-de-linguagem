//#include<iostream>
//
//struct No
//{
//	int key;
//	struct No* esquerda;
//	struct No* direita;
//};
//
//struct No* novoNo(int data)
//{
//	struct No* no = new No;
//	no->key = data;
//	no->esquerda = NULL;
//	no->direita = NULL;
//	return(no);
//}
//void inOrder(struct No* root)
//{
//	if (root != NULL)
//	{
//		inOrder(root->esquerda);
//		std::cout << root->key << " ";
//		inOrder(root->direita);
//	}
//}
//void preOrder(struct No* root)
//{
//	if (root !=NULL)
//	{
//		std::cout << root->key << " ";
//		preOrder(root->esquerda);
//		preOrder(root->direita);
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
//int main()
//{
//	struct No* root = novoNo(1);
//	
//
//
//	root->esquerda = novoNo(2);
//	root->direita = novoNo(3);
//	root->esquerda->esquerda = novoNo(4);
//
//	std::cout << "pre_order" << std::endl;
//	preOrder(root);
//
//	std::cout << "\n";
//	std::cout << "in_ordem" << std::endl;
//	inOrder(root);
//
//	std::cout << "\n";
//	std::cout << "pos_order" << std::endl;
//	posOrder(root);
//
//	return 0;
//}