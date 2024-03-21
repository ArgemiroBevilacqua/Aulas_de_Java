// Definindo a interface
interface Animal {
    void comer();
    void dormir();
}

// Implementando a Interface em uma classe
class Cachorro implements Animal {
    // Implementando os métodos da interface
    public void comer() {
        System.out.println("O cachorro está comendo");
    }

    public void dormir() {
        System.out.println("O cachorro está dormindo");
    }
}

public class Exercicio03 {
    public static void main(String[] args) {
        // Criando um objeto da classe Cachorro
        Cachorro meuCachorro = new Cachorro();
        // Chamando os métodos
        meuCachorro.comer(); // Saída: O cachorro está comendo
        meuCachorro.dormir(); // Saída: O cachorro está dormindo
    }
}
