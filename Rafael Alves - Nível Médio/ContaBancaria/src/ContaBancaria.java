public class ContaBancaria {
    int numeroDaConta;
    double saldo;

    void depositar(double valor) {
        saldo += valor;
    }
    void sacar(double valor) {
        if(valor > saldo){
            throw new RuntimeException("Falha no saque! Saldo insuficiente");
        } else
            saldo -= valor;
    }
    double verSaldo() {
        return saldo;
    }
}
