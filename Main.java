package main;

public class Main {

	public static void main(String[] args) {
		
		Cachorro meuCachorro = new Cachorro();
		
		meuCachorro.nome = "Rex";
		meuCachorro.idade = 5;
		meuCachorro.raca = "Labrador";
		
		meuCachorro.exibirDetalhes();
		meuCachorro.exibirRaca();
	}

}
