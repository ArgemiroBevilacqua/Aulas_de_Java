import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria contaBancaria = new ContaBancaria();

        System.out.println("Saldo: " + contaBancaria.verSaldo());

        System.out.println("Deposite um valor: ");
        contaBancaria.depositar(scanner.nextDouble());

        System.out.println("Saldo: " + contaBancaria.verSaldo());

        System.out.println("Insira um valor para saque: ");
        contaBancaria.sacar(scanner.nextDouble());

        System.out.println("Saldo: " + contaBancaria.verSaldo());
    }
}