public class ContaBancaria {
    private int numeroDaConta;
    private double saldo;

    public ContaBancaria(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }
    public void depositar(double valor) {
        saldo += valor;
    }
    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
        }
    }
    public void verSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }
}
