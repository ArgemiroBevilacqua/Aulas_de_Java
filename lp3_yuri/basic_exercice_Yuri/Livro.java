public class Livro {

    private String titulo;
    private String autor;
    private int anpDePublicacao;

    public Livro(String titulo, String autor, int anpDePublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anpDePublicacao = anpDePublicacao;
    }

    public void imprimirDetalhes(){
        System.out.println("Os dados do livro são:");
        System.out.println(titulo);
        System.out.println(autor);
        System.out.println(anpDePublicacao);
    }

    public static void main(String[] args){
        Livro livro = new Livro("Bom Livro","Yuri", 2024);

        livro.imprimirDetalhes();
    }
    
}
