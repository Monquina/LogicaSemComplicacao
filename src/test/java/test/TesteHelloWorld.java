package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import hello.HelloWorld;



public class TesteHelloWorld {
	
	@Test
	public void RealizaTestHello() throws Exception {
//		Classe nomeObjeto = new Classe();
//		Tipo        nome
		HelloWorld helloWorld = new HelloWorld("Hello World!");
		String texto = "teste";
	  	 	
		texto = helloWorld.getHelloWorld();
		
		assertEquals("Hello World!", texto);
		
//		if(texto.equals("Hello World")) {
//			System.out.println("Teste com sucesso");
//		}else {
//			System.out.println("Esperado: 'Hello World', Encontrado: '" +texto+ "'");
//			throw new Exception("Esperado: 'Hello World', Encontrado: '" +texto+ "'");
		
		
//		o metodo helloWorld.getHelloWorld2 não aparece aqui pois é privado
//		helloWorld.
		}
	
	@Test
	public void TestComparacao() {
		String texto = HelloWorld.getTexto();
		assertEquals("Teste", texto);
	}
	}


