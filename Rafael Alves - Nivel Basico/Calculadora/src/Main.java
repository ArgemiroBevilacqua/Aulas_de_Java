import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Calculadora calculadora = new Calculadora();

            System.out.println("Informe o primeiro número: ");
            double n1 = scanner.nextDouble();
            System.out.println("Informe o segundo número: ");
            double n2 = scanner.nextDouble();

            System.out.println("Soma: " + calculadora.somar(n1, n2));
            System.out.println("Subtração: " + calculadora.subtrair(n1, n2));
            System.out.println("Multiplicação: " + calculadora.multiplicar(n1, n2));
            System.out.println("Divisão: " + calculadora.dividir(n1, n2));
    }
}