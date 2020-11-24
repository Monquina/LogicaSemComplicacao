package logica;

import java.util.ArrayList;
import java.util.List;

public class EstruturaRepeticao {
	/*36. Entrar via teclado com um valor qualquer. Exibir a tabuada do valor solicitado, no intervalo de um a dez.
	 */
	
	public List<Integer> tabuada(int valor) {
		List<Integer> resultado = new ArrayList<Integer>();
		
		int x = 1;
		while (x < 11) {
			resultado.add(valor * x);
			x++;
		}
		return resultado;
	}
	
	

	
}
