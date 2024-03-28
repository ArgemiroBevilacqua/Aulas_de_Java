public class Livro {

    String titulo;
    String autor;
    int anoDePublicacao;

    public void imprimirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoDePublicacao);
    }
}