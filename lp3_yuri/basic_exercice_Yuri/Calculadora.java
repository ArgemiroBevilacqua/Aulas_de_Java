public class Calculadora {
    
    public double somar(double num1, double num2) {
        return num1 + num2;
    }
    
    public double subtrair(double num1, double num2) {
        return num1 - num2;
    }
    
    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }
    
    public double dividir(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Erro: Divisão por zero!");
            return Double.NaN; 
        }
    }
    
    public static void main(String[] args) {
       
        Calculadora calc = new Calculadora();
        
        double num1 = 10;
        double num2 = 5;
        
        System.out.println("Soma: " + calc.somar(num1, num2));
        System.out.println("Subtração: " + calc.subtrair(num1, num2));
        System.out.println("Multiplicação: " + calc.multiplicar(num1, num2));
        System.out.println("Divisão: " + calc.dividir(num1, num2));
    }
}
