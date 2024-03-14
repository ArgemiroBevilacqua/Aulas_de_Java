package Tratamento_Excecao;

public class Main {

	public static void main(String[] args) {
		try {
			int[] numeros = {1, 2, 3};
			System.out.println(numeros[10]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Indice do array fora dos limites");
		} finally {
			System.out.println("Esse bloco 'finally' sempre será executado.");
		}

	}

}
