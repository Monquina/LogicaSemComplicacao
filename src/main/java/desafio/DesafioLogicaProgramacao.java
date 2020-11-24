package desafio;

public class DesafioLogicaProgramacao {
	/*1. Criar um método para calcular e retornar a área de um triangulo, esse método deve receber dois valores 
	inteiros referente a base e altura do triangulo.
	Dica:
	Area = Base X Altura / 2
	*/

	public int areaTriangulo(int base, int altura)	{
		int area;
		
		area = (base * altura)/2;
		return area;
				
	}
	
/*	2. Criar um método que receberá 3 valores inteiros e deverá retornar o maior deles.
	Dica:
	Será necessário utilizar If com duas condições combinadas.
	*/

	public String maiorNumero(int v1, int v2, int v3) {		
		
		if (v1 > v2) {
			if(v1 > v3) {
				return "O maior número é :" +v1;
			}				
		}
		if (v2 > v3) {
			return "O maior número é :" +v2;	
		}
		return "O maior número é :"+v3;		
		}
	
/*3. Criar um método que deverá retornar a soma dos números inteiros positivos do intervalo de um a cem.
	*/
	
	public String somaNumeros() {
		int soma = 0;
	
		
		for (int i = 0; i <= 100; i++) {
			soma += i;
		}
		return "A soma deve ser:" +soma;
	}
	
}
