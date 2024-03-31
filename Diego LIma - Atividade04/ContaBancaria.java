package aula05;
public class ContaBancaria {
   
    private String numeroDaConta;
    private double saldo;

   
    public ContaBancaria(String numeroDaConta, double saldoInicial) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldoInicial;
    }

   
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado com sucesso.");
    }

 
    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para realizar o saque.");
        } else {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        }
    }

 
    public void verSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }

    public static void main(String[] args) {
        
        ContaBancaria conta = new ContaBancaria("123456", 1000);

        conta.verSaldo(); 

        conta.depositar(500);
        conta.verSaldo(); 
        conta.sacar(200);
        conta.verSaldo();
        conta.sacar(2000); 
        conta.verSaldo(); 
    }
}
