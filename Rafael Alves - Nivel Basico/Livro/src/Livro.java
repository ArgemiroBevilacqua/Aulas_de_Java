public class Livro {
    String titulo, autor;
    int anoPubli;

    void imprimirDetalhes() {
        System.out.println("\nDetalhes do livro");
        System.out.println("Título do livro: " + titulo);
        System.out.println("Nome do autor: " + autor);
        System.out.println("Ano de publicação: " + anoPubli);
    }
}
