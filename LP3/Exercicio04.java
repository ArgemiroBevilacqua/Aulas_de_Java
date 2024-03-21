public class Exercicio04 {
    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[10]); // Isso irá lançar uma exceção
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Índice do array fora dos limites!");
        } finally {
            System.out.println("Este bloco 'finally' sempre será executado.");
        }
    }
}
