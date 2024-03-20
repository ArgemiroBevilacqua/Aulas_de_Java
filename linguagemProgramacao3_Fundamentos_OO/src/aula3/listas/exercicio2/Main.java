package aula3.listas.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        
        lista.add("Abacate");
        lista.add("Banana");
        lista.add("Cenoura");
        lista.add("Rabanete");
        lista.add("Berinjela");
        lista.add("Maçã");

        for (String itens : lista) {
            System.out.println(itens);
        }
    }
}
