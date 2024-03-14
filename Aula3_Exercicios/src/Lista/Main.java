
package Lista;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<String> minhaLista = new ArrayList<String>();
		
		//ADICIONANDO ELEMENTOS
		minhaLista.add("a");
		minhaLista.add("b");
		minhaLista.add("c");
		
		//IMPRIMINDO A LISTA
		System.out.println("minhaLista");
		
		//REMOVENDO ELEMENTO "B"
		minhaLista.remove("b");
		System.out.println("minhaLista");
		
		//VERIFICANDO SE A LISTA CONTÉM ELEMENTO "A"
		System.out.println(minhaLista.contains("a"));
		
		//OBTENDO O TAMANHO DA LISTA
		System.out.println(minhaLista.size());
		
		//VERIFICANDO SE A LISTA STÁ VAZIA
		System.out.println(minhaLista.isEmpty());
		
		//LIMPANDO A LISTA
		minhaLista.clear();
		System.out.println(minhaLista.size());
		

	}

}
