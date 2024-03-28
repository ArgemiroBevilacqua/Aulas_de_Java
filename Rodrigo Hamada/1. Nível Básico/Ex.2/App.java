public class App {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome = "João";
        estudante.idade = 20;
        estudante.nota = 8.5;

        if (estudante.aprovado()) {
            System.out.println(estudante.nome + " foi aprovado.");
        } else {
            System.out.println(estudante.nome + " não foi aprovado.");
        }
    }
}
