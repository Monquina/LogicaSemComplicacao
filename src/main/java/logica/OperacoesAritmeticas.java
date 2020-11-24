package logica;

public class OperacoesAritmeticas {
//	Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área.

	public int calculoAreaRetangulo(int base, int altura) {
		int area;
		
		area = base*altura;
		return area;
	}

	public int calculoAreaQuadrado(int aresta) {
		// TODO Auto-generated method stub
		int area;
		
		area = aresta*aresta;
		return area;
	}

	public double calculoDoDolarReais(double cotacao, int qtDolar) {
		// TODO Auto-generated method stub
		
		double reais = cotacao*qtDolar;
		return reais;
	}
	

/*6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.*/
	
	public double calculoMediaAritmetica(double v1, double v2, double v3, double v4) {
		double media = (v1+v2+v3+v4)/4;
		return media;
	}
	
/*17. Entrar via teclado com dois valores quaisquer “X” e “X”. Calcular e exibir 
	o cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln.8*/
	
	public int calculoExponencial(int x, int y) {
		int exp = (int) Math.pow(x, y);
		return exp;
	}
	
/*18. Entrar via teclado com o valor de cinco produtos. 
 * Após as entradas, digitar um valor referente ao pagamento da somatória destes valores.
 * Calcular e exibir o troco que deverá ser devolvido. */
	
	public int calculoTroco(int v1, int v2, int v3, int v4, int v5, int pgto) {
		int troco = pgto - (v1+v2+v3+v4+v5);
		return troco;
		
	}
	
/*21. Entrar com dois valores quaisquer. Exibir o maior deles, se existir, caso contrário,
 *  enviar mensagem avisando que os números são idênticos.	
 */
 
	public String verificaMaiorNumero(int v1, int v2) {
		
		if (v1>v2) {
			
			return "O maior número é o:" +v1;
			
		}else if (v2>v1)
		{
			return "O maior número é o:" +v2;
		}else
		{
			return "Os valores são idênticos";
	    }
}	
	
/*23. Calcular e exibir a área de um retângulo, a partir dos valores da base e altura que serão digitados.
 *  Se a área for maior que 100, exibir a mensagem “Terreno grande”, caso contrário, exibir a mensagem “Terreno pequeno”.	
 */
	
	public String tamanhoTerreno(int base, int altura) {
		
		int area = (base*altura);		
		
		if (area>100) {
			return "Terreno Grande";
		}else {
			return "Terreno Pequeno";
	    }
			
	}
	
/*28. Entrar com o peso, o sexo e a altura de uma determinada pessoa. Após a digitação, exibir se esta pessoa
 *  está ou não com seu peso ideal. Veja tabela da relação peso/altura².	
 */

	public String pesoAltura(double peso, String sexo, double altura) {
		
		if (altura <= 0) {
			return "Valor inválido para altura";			
		}
		
		double r = peso/(altura*altura);
		
//		if (sexo.equals("f") && r<19) {
//			return "Abaixo do peso";
//		}else if (sexo.equals("f") && r>=19 && r<24) {
//			return "Peso ideal";
//		}else if (sexo.equals("f") &&  r>=24) {
//			return "Acima do peso";
//		}
//		
//		if (sexo.equals("m") && r <20) {
//			return "Abaixo do peso";
//		}else if (sexo.equals("m") && r >= 20 && r < 25) {
//			return "Peso ideal";
//		}else if (sexo.equals("m") &&  r >= 25) {
//			return "Acima do peso";
//		}
		
		if ((sexo.equals("f") && r<19) || (sexo.equals("m") && r <20)) {
			return "Abaixo do peso";
		}else if ((sexo.equals("f") && r>=19 && r<24) || (sexo.equals("m") && r >= 20 && r < 25)) {
			return "Peso ideal";
		}else {
			return "Acima do peso";
		}
		
		
	}
	
	
}

