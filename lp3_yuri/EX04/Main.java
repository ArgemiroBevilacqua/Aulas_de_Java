package EX04;

public class Main {

    public static void main(String[] args) {

        try {
            int[] numeros = new int[3];
            numeros[0] = 1;
            numeros[1] = 2;
            numeros[2] = 3;

            System.out.println(numeros[10]); // Isso irá lançar uma exceção
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indice do array fora dos limites!");
        } finally {
            System.out.println("Este bloco 'finally' sempre será executado.");
        }

    }

}
