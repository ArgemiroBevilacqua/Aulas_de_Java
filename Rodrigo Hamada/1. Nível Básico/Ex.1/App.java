public class App {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Testando os métodos
        System.out.println("Soma: " + calc.somar(10, 5));
        System.out.println("Subtração: " + calc.subtrair(10, 5));
        System.out.println("Multiplicação: " + calc.multiplicar(10, 5));
        System.out.println("Divisão: " + calc.dividir(10, 5));
    }
}
