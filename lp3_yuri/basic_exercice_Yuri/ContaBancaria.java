public class ContaBancaria {
    private String numeroDaConta;
    private double saldo;
    
    public ContaBancaria(String numeroDaConta, double saldoInicial) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldoInicial;
    }
    
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " na conta " + numeroDaConta + " realizado com sucesso.");
    }
    
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " da conta " + numeroDaConta + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente na conta " + numeroDaConta + " para realizar o saque de R$" + valor);
        }
    }
    
    public void verSaldo() {
        System.out.println("Saldo atual da conta " + numeroDaConta + ": R$" + saldo);
    }
    
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("123456", 1000.0);
        ContaBancaria conta2 = new ContaBancaria("654321", 2000.0);
        
        conta1.verSaldo();
        conta1.depositar(500.0);
        conta1.verSaldo();
        conta1.sacar(200.0);
        conta1.verSaldo();
        conta1.sacar(1500.0);
        conta1.verSaldo();
        
        System.out.println();
        
        conta2.verSaldo();
        conta2.depositar(1000.0);
        conta2.verSaldo();
        conta2.sacar(2500.0);
        conta2.verSaldo();
    }
}
