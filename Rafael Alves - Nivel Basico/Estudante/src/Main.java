import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estudante estudante = new Estudante();

        System.out.println("Informe o nome do aluno: ");
        estudante.nome = scanner.nextLine();
        System.out.println("Informe a idade do aluno: ");
        estudante.idade = scanner.nextInt();
        System.out.println("Informe a nota do aluno: ");
        estudante.nota = scanner.nextDouble();

        if(estudante.aprovado()) {

            System.out.println("Aprovado");
        }else
            System.out.println("Reprovado");
    }
}