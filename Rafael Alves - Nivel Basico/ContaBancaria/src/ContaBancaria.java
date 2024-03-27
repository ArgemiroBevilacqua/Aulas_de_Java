public class ContaBancaria {
    int numeroDaConta;
    double saldo;

    void depositar(double valor) {
        saldo += valor;
    }
    void sacar(double valor) {
        saldo -= valor;
    }
    double verSaldo() {
        return saldo;
    }
}
