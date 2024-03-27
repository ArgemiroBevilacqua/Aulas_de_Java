public class Livro {
    private String titulo;
    private String autor;
    private int anoDePublicacao;

    public Livro(String titulo, String autor, int anoDePublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }

    public void imprimirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoDePublicacao);
    }

}
