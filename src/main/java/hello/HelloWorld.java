package hello;

public class HelloWorld {
	String texto;
	
	public HelloWorld(String _texto) {
		texto = _texto;
	}
	

	public String getHelloWorld() {
		return texto;
	}
	
//	como ele � privado ele n�o aparece la no TesteHelloWorld, somente aqui na classe de HelloWorld
	private String getHelloWorld2() {
		return texto;
	}
	
	
	public static String getTexto() {
		return "Teste";

	}
}

