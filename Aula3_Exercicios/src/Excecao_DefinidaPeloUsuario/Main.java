package Excecao_DefinidaPeloUsuario;

public class Main {

	public static void main(String[] args) {
		try {
			throw new MinhaExcecao("Esta � uma exce��o definida pelo usu�rio!");
		} catch ( MinhaExcecao e) {
			System.out.println(e.getMessage());
		}

	}

}
