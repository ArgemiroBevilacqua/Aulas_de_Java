public class App {
        public static void main(String[] args) {
            Retangulo retangulo = new Retangulo(5, 7);
            System.out.println("Área do retângulo: " + retangulo.area());

            Circulo circulo = new Circulo(3);
            System.out.println("Área do círculo: " + circulo.area());

            Triangulo triangulo = new Triangulo(4, 6);
            System.out.println("Área do triângulo: " + triangulo.area());
        }
    }
