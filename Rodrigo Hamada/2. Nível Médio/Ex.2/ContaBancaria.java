public class ContaBancaria {

    int numeroDaConta;
    double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            throw new SaldoInsuficienteException("Saldo insuficiente.");
        }
    }

    public void verSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }
}