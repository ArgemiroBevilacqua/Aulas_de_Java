public class Estudante {
    private String nome;
    private double nota;
    private int idade;

    public Estudante(String nome, int idade, double nota){
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;

        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Idade: %d\n", idade);
        System.out.printf("Nota: %.2f\n", nota);
    }

    public boolean aprovado(){
        return nota >= 7;
    }
}
