#include<iostream>

int main() {
	int a, b;

	int soma;
	a = -14;
	b = 3;
	soma = a % b;
	//soma = (a / b) * b + a % b;
	std::cout << soma;
}