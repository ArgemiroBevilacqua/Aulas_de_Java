//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(10);
        Circulo circulo = new Circulo(12.5);
        Retangulo retangulo = new Retangulo(12, 10);

        System.out.println("\nÁrea do quadrado: " + quadrado.calcularArea());
        System.out.println("Perímetro do quadrado: " + quadrado.calcularPerimetro());

        System.out.println("\nÁrea do círculo: " + circulo.calcularArea());
        System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());

        System.out.println("\nÁrea do retângulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());
    }
}