public class App {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.numeroDaConta = 123456;
        conta.saldo = 1000.0;

        conta.depositar(500.0);
        conta.verSaldo(); 

        try {
            conta.sacar(2000.0);
        } catch (SaldoInsuficienteException e) {
            e.printStackTrace();
        }
        conta.verSaldo(); 
    }
    }
