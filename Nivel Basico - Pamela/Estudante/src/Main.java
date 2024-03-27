public class Main {
    public static void main(String[] args) {
        Estudante aluno = new Estudante("Pamela",21,6.9);
        System.out.printf("Aprovado: %b\n", aluno.aprovado());
    }
}