package Excecao_DefinidaPeloUsuario;

public class Main {

	public static void main(String[] args) {
		try {
			throw new MinhaExcecao("Esta é uma exceção definida pelo usuário!");
		} catch ( MinhaExcecao e) {
			System.out.println(e.getMessage());
		}

	}

}
