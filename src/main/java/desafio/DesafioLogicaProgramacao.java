package desafio;

public class DesafioLogicaProgramacao {
	/*1. Criar um m�todo para calcular e retornar a �rea de um triangulo, esse m�todo deve receber dois valores 
	inteiros referente a base e altura do triangulo.
	Dica:
	Area = Base X Altura / 2
	*/

	public int areaTriangulo(int base, int altura)	{
		int area;
		
		area = (base * altura)/2;
		return area;
				
	}
	
/*	2. Criar um m�todo que receber� 3 valores inteiros e dever� retornar o maior deles.
	Dica:
	Ser� necess�rio utilizar If com duas condi��es combinadas.
	*/

	public String maiorNumero(int v1, int v2, int v3) {		
		
		if (v1 > v2) {
			if(v1 > v3) {
				return "O maior n�mero � :" +v1;
			}				
		}
		if (v2 > v3) {
			return "O maior n�mero � :" +v2;	
		}
		return "O maior n�mero � :"+v3;		
		}
	
/*3. Criar um m�todo que dever� retornar a soma dos n�meros inteiros positivos do intervalo de um a cem.
	*/
	
	public String somaNumeros() {
		int soma = 0;
	
		
		for (int i = 0; i <= 100; i++) {
			soma += i;
		}
		return "A soma deve ser:" +soma;
	}
	
}
