public class App {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.titulo = "O Senhor dos Anéis";
        livro.autor = "J. R. R. Tolkien";
        livro.anoDePublicacao = 1954;

        livro.imprimirDetalhes();
    }
}
