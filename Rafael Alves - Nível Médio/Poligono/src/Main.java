import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Retangulo retangulo = new Retangulo(10, 5);
        Circulo circulo = new Circulo(12);
        Triangulo triangulo = new Triangulo(18, 8);

        System.out.println("Área do retângulo: " + retangulo.area());
        System.out.println("Área do círculo: " + circulo.area());
        System.out.println("Área do triângulo: " + triangulo.area());

    }
}