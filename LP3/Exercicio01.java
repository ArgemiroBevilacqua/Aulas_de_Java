import java.util.*;

public class Exercicio01 {
    public static void main(String[] args) {
        // Criando uma lista
        List<String> minhaLista = new ArrayList<String>();

        // Adicionando elementos à lista
        minhaLista.add("a");
        minhaLista.add("b");
        minhaLista.add("c");

        // Imprimindo a lista
        System.out.println(minhaLista); // Saída: [a, b, c]

        // Removendo um elemento da lista
        minhaLista.remove("b");
        System.out.println(minhaLista); // Saída: [a, c]

        // Verificando se a lista contém um elemento
        System.out.println(minhaLista.contains("a")); // Saída: true

        // Obtendo o tamanho da lista
        System.out.println(minhaLista.size()); // Saída: 2

        // Verificando se a lista está vazia
        System.out.println(minhaLista.isEmpty()); // Saída: false

        // Limpando a lista
        minhaLista.clear();
        System.out.println(minhaLista); // Saída: []
    }
}
