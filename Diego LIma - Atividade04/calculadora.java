package aula05;

public class calculadora {
  
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
        if (num2 == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero.");
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
       
        calculadora calculadora = new calculadora();

       
        double resultadoSoma = calculadora.somar(5, 3);
        double resultadoSubtracao = calculadora.subtrair(10, 4);
        double resultadoMultiplicacao = calculadora.multiplicar(6, 2);
        double resultadoDivisao = calculadora.dividir(20, 5);

        
        System.out.println("Resultado da soma: " + resultadoSoma);
        System.out.println("Resultado da subtração: " + resultadoSubtracao);
        System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao);
        System.out.println("Resultado da divisão: " + resultadoDivisao);
    }
}