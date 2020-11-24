package testLogica;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import logica.OperacoesAritmeticas;

public class TestOperacoesAritmeticas {
	
//	Entrar via teclado com a base e a altura de um ret�ngulo, calcular e exibir sua �rea.
	OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();	
	
	@Test
	public void testAreaRetangulo() {
		
		OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();		
		int area = opAritmeticas.calculoAreaRetangulo(5, 10);		
		assertEquals(50, area);
	}

//	TDD
	@Test
	public void testAreaQuadrado() {
		
		int area = opAritmeticas.calculoAreaQuadrado(10);		
		assertEquals(100, area);				
	} 

	@Test
	public void testCotacaoDolar() {
		double reais = opAritmeticas.calculoDoDolarReais(5.50, 10);
		
		//quando coloco 1 n�o to comparando as casas decimais, 0 � precisamente igual
		assertEquals(55.0, reais, 1);
	}
	

//6. Calcular e exibir a m�dia aritm�tica de quatro valores quaisquer que ser�o digitados.

	@Test
	public void testMediaAritmetica() {
		
		// usando o objeto local
		double media = this.opAritmeticas.calculoMediaAritmetica(1, 2, 3, 4);
		assertEquals(2.5, media, 0);
	}
	
/*17. Entrar via teclado com dois valores quaisquer �X� e �X�. Calcular e 
	exibir o c�lculo XY (�X� elevado a �Y�). Pesquisar as fun��es Exp e Ln.	*/
	
	@Test
	public void testExponencial() {
		
		int exp= opAritmeticas.calculoExponencial(2, 3);
		assertEquals(8, exp);
	}
	
	/*18. Entrar via teclado com o valor de cinco produtos. Ap�s as entradas,
	 *  digitar um valor referente ao pagamento da somat�ria destes valores. Calcular 
	 *  e exibir o troco que dever� ser devolvido
	 */
	
	@Test
	public void testTroco() {
		
		int troco = opAritmeticas.calculoTroco(1, 1, 1, 1, 1, 10);
		assertEquals(5, troco);
	}

	/*21. Entrar com dois valores quaisquer. Exibir o maior deles, se existir, caso contr�rio,
	 *  enviar mensagem avisando que os n�meros s�o id�nticos.	
	 */

	@Test
	public void testVerificaMaiorNumero() {	
		
		String mensagem = opAritmeticas.verificaMaiorNumero(5, 10);
		String mensagem1 = opAritmeticas.verificaMaiorNumero(15, 12);		
		String mensagem2 = opAritmeticas.verificaMaiorNumero(10, 10);
		
		assertEquals("O maior n�mero � o:10", mensagem);
		assertEquals("O maior n�mero � o:15", mensagem1);
		assertEquals("Os valores s�o id�nticos", mensagem2);
	}
	
	/*23. Calcular e exibir a �rea de um ret�ngulo, a partir dos valores da base e altura que ser�o digitados.
	 *  Se a �rea for maior que 100, exibir a mensagem �Terreno grande�, caso contr�rio, exibir a mensagem �Terreno pequeno�.	
	 */
	
	@Test
	public void testTamanhoTerreno() {
		
		String mensagem = opAritmeticas.tamanhoTerreno(2, 3);
		assertEquals("Terreno Pequeno", mensagem);
		mensagem = opAritmeticas.tamanhoTerreno(10, 15);
		assertEquals("Terreno Grande", mensagem);
	}
    
	
	/*28. Entrar com o peso, o sexo e a altura de uma determinada pessoa. Ap�s a digita��o, exibir se esta pessoa
	 *  est� ou n�o com seu peso ideal. Veja tabela da rela��o peso/altura�.	
	 */	

	@Test 
	public void testPesoAltura() {
		String mensagem = opAritmeticas.pesoAltura(57, "f", 1.82);
		assertEquals("Abaixo do peso", mensagem);
		
		mensagem = opAritmeticas.pesoAltura(68, "m", 1.70);
		assertEquals("Peso ideal", mensagem);
		
		mensagem = opAritmeticas.pesoAltura(100, "m", 1.40);
		assertEquals("Acima do peso", mensagem);
		
		mensagem = opAritmeticas.pesoAltura(78, "f", 1.58);
		assertEquals("Acima do peso", mensagem);
		
		mensagem = opAritmeticas.pesoAltura(78, "f", 0);
		assertEquals("Valor inv�lido para altura", mensagem);
		System.out.println(mensagem);
	}
}

