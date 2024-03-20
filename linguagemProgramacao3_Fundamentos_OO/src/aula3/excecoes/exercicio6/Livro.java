package aula3.excecoes.exercicio6;

public class Livro {
    private int totalPaginas;

    public Livro(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public void lerPagina(int pagina) throws PaginaInvalida {
        try {
            if (pagina < 1 || pagina > this.getTotalPaginas()) {
                throw new PaginaInvalida("Página inválida, tente uma outra novamente.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Você está lendo no momento a página: " + pagina);
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }
}
