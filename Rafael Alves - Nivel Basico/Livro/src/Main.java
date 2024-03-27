import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Livro livro = new Livro();

        System.out.println("Informe o título do livro");
        livro.titulo = scanner.nextLine();
        System.out.println("Informe o nome do autor");
        livro.autor = scanner.nextLine();
        System.out.println("Informe o ano de publicação");
        livro.anoPubli = scanner.nextInt();

        livro.imprimirDetalhes();


    }
}