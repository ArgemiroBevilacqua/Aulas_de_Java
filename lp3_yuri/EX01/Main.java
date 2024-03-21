package EX01;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Criando uma lista (Creating a list)
        List<String> minhaLista = new ArrayList<String>();

        // Adicionando elementos à lista (Adding elements to the list)
        minhaLista.add("a");
        minhaLista.add("b");
        minhaLista.add("c");

        // Imprimindo a lista (Printing the list)
        System.out.println(minhaLista); // Saida: [a, b, c]

        // Removendo um elemento da lista (Removing an element from the list)
        minhaLista.remove("b");

        System.out.println(minhaLista); // Saida: [a, c]

        // Verificando se a lista contém um elemento (Checking if the list contains an element)
        System.out.println(minhaLista.contains("a")); // Saida: true

        // Obtendo o tamanho da lista (Getting the size of the list)
        System.out.println(minhaLista.size()); // Saida: 2

        // Verificando se a lista está vazia (Checking if the list is empty)
        System.out.println(minhaLista.isEmpty()); // Saída: false

        // Limpando a lista (Clearing the list)
        minhaLista.clear();

        System.out.println(minhaLista); // Saida: []
    }
}
