package testLogica;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import logica.EstruturaRepeticao;


public class TestEstruturaRepeticao {
	EstruturaRepeticao estruturaRepeticao = new EstruturaRepeticao();

	@Test
	public void testTabuada() {
		List<Integer> resultado = estruturaRepeticao.tabuada(5);
		
		List<Integer> esperado = new ArrayList<Integer>();
		esperado.add(5);
		esperado.add(10);
		esperado.add(15);
		esperado.add(20);
		esperado.add(25);
		esperado.add(35);
		esperado.add(35);
		esperado.add(40);
		esperado.add(45);
		esperado.add(50);
		
		assertEquals(esperado, resultado);
	}
	
	/*37. Entrar via teclado com um valor (X) qualquer.
	 * 	 * Solicitar o intervalo que o programa que deverá calcular a tabuada do valor digitado, sendo que o segundo valor (B), 
	 * deverá ser maior que o primeiro (A), caso contrário,exibir mensagem de erro. Após a validação dos dados
     exibir a tabuada do valor digitado, no intervalo decrescente, ou seja, a tabuada de X no intervalo de B para A. */
	
	@Test
	public void testTabuadaDecrescente() {
		int x= 5;
		int a = 2;
		int b = 8;
		
		if (b < a) {
			System.out.print("O valor B deve ser maior do que o valor A");
			return;			
		}
		for (int i = b; i >= a; i--) {
			System.out.println(x+" x " +i+" = "+(x*i));
			
		}
		
	}
	

}
