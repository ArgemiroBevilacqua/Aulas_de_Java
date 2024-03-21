// Classe base ou superclasse
class Animal {
    String nome;
    int idade;
    
    void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

// Classe derivada ou subclasse
class Cachorro extends Animal {
    String raca;

    void exibirRaca() {
        System.out.println("Raça: " + raca);
    }
}

// Classe principal
public class Exercicio02 {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro();
        meuCachorro.nome = "Rex";
        meuCachorro.idade = 5;
        meuCachorro.raca = "Labrador";
        
        meuCachorro.exibirDetalhes(); // método da superclasse
        meuCachorro.exibirRaca(); // método da subclasse
    }
}
