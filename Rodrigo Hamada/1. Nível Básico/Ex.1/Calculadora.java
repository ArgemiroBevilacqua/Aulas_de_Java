public class Calculadora {

    // Método para somar
    public double somar(double num1, double num2) {
        return num1 + num2;
    }

    // Método para subtrair
    public double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    // Método para multiplicar
    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    // Método para dividir
    public double dividir(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Erro: Divisão por zero não é permitida.");
            return 0;
        }
    }
}