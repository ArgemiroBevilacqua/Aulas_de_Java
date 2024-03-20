import java.util.*;

class Livro {
    int totalPaginas = 150;
    
    public void lerPagina(int pagina) {
        if(pagina < 1 || pagina > totalPaginas){
            throw new RuntimeException("Página inválida!");
        } else
        System.out.println("Página encontrada!");
        
    }
}

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();
        
        livro.lerPagina(158);
    }
}