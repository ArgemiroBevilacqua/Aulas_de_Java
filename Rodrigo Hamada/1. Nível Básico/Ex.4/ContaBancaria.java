public class ContaBancaria {

    int numeroDaConta;
    double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void verSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }
}