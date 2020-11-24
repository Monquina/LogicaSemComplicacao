package desafio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestDesafioLogicaProgramacao {
	DesafioLogicaProgramacao desafioLogicaProgramacao = new DesafioLogicaProgramacao();
	
	/*1. Criar um método para calcular e retornar a área de um triangulo, esse método deve receber dois valores 
	inteiros referente a base e altura do triangulo.
	Dica:
	Area = Base X Altura / 2
	*/	
	
	@Test
	public void testAreaTriangulo() {
		
		int area = desafioLogicaProgramacao.areaTriangulo(4, 2);
		
		assertEquals(4, area);
		System.out.println(area);
		
	}

	@Test
	public void testMaiorNumero() {
		
		String mensagem = desafioLogicaProgramacao.maiorNumero(3, 4, 5);
		
		assertEquals("O maior número é :5", mensagem);
		System.out.println(mensagem);
	}
	
	@Test 
	public void testSoma() {
		
		String soma = desafioLogicaProgramacao.somaNumeros();
		
		assertEquals("A soma deve ser:5050", soma);
		System.out.println(soma);
		
		
	}
}
