public class Main {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        System.out.println("Soma: " + c.somar(5, 3));
        System.out.println("Subtração: " + c.subtrair(5, 3));
        System.out.println("Multiplicação: " + c.multiplicar(5, 3));
        System.out.println("Divisão: " + c.dividir(6, 3));
    }
}