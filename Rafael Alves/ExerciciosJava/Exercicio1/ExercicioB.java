import java.util.*;

public class Main {
        public static void main(String[] args) {
            
            List<String> listaCompra = new ArrayList<String>();
            listaCompra.add("Pão");
            listaCompra.add("Sorvete");
            listaCompra.add("Arroz");
            listaCompra.add("Feijão");
            
            for(int i = 0; i < listaCompra.size(); i++){
                System.out.println(listaCompra.get(i));
            }
            
            System.out.println("\n");
            
            listaCompra.remove("Arroz");
            
            for(int i = 0; i < listaCompra.size(); i++){
                System.out.println(listaCompra.get(i));
            }

        }
}