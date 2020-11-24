package logica;

public class OperacoesAritmeticas {
//	Entrar via teclado com a base e a altura de um ret�ngulo, calcular e exibir sua �rea.

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
	

/*6. Calcular e exibir a m�dia aritm�tica de quatro valores quaisquer que ser�o digitados.*/
	
	public double calculoMediaAritmetica(double v1, double v2, double v3, double v4) {
		double media = (v1+v2+v3+v4)/4;
		return media;
	}
	
/*17. Entrar via teclado com dois valores quaisquer �X� e �X�. Calcular e exibir 
	o c�lculo XY (�X� elevado a �Y�). Pesquisar as fun��es Exp e Ln.8*/
	
	public int calculoExponencial(int x, int y) {
		int exp = (int) Math.pow(x, y);
		return exp;
	}
	
/*18. Entrar via teclado com o valor de cinco produtos. 
 * Ap�s as entradas, digitar um valor referente ao pagamento da somat�ria destes valores.
 * Calcular e exibir o troco que dever� ser devolvido. */
	
	public int calculoTroco(int v1, int v2, int v3, int v4, int v5, int pgto) {
		int troco = pgto - (v1+v2+v3+v4+v5);
		return troco;
		
	}
	
/*21. Entrar com dois valores quaisquer. Exibir o maior deles, se existir, caso contr�rio,
 *  enviar mensagem avisando que os n�meros s�o id�nticos.	
 */
 
	public String verificaMaiorNumero(int v1, int v2) {
		
		if (v1>v2) {
			
			return "O maior n�mero � o:" +v1;
			
		}else if (v2>v1)
		{
			return "O maior n�mero � o:" +v2;
		}else
		{
			return "Os valores s�o id�nticos";
	    }
}	
	
/*23. Calcular e exibir a �rea de um ret�ngulo, a partir dos valores da base e altura que ser�o digitados.
 *  Se a �rea for maior que 100, exibir a mensagem �Terreno grande�, caso contr�rio, exibir a mensagem �Terreno pequeno�.	
 */
	
	public String tamanhoTerreno(int base, int altura) {
		
		int area = (base*altura);		
		
		if (area>100) {
			return "Terreno Grande";
		}else {
			return "Terreno Pequeno";
	    }
			
	}
	
/*28. Entrar com o peso, o sexo e a altura de uma determinada pessoa. Ap�s a digita��o, exibir se esta pessoa
 *  est� ou n�o com seu peso ideal. Veja tabela da rela��o peso/altura�.	
 */

	public String pesoAltura(double peso, String sexo, double altura) {
		
		if (altura <= 0) {
			return "Valor inv�lido para altura";			
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

