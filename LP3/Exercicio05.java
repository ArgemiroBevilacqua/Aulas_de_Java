public class Exercicio05 extends Exception {
    public Exercicio05(String mensagem) {
        super(mensagem);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            throw new Exercicio05("Esta é uma exceção definida pelo usuário");
        } catch (Exercicio05 e) {
            System.out.println(e.getMessage());
        }
    }
}
