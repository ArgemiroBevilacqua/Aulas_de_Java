package EX02;

public class Cachorro extends Animal {

    private String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    public void exibirRaca() {
        System.out.println("Raça: " + raca);
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        exibirRaca();
    }
}