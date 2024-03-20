import java.util.*;

interface DispositivoEletronico {
   void ligar();
   void desligar();
}

class Computador implements DispositivoEletronico {
    
    public void ligar() {
        System.out.println("O computador ligou!");
    }
    
    public void desligar() {
        System.out.println("O computador desligou!");
    }
}

class Televisao implements DispositivoEletronico {
    
    public void ligar() {
        System.out.println("A televisão ligou!");
    }
    
    public void desligar() {
        System.out.println("A televisão desligou!");
    }
}

public class Main {
        public static void main(String[] args) {
          Televisao televisao = new Televisao();
          Computador computador = new Computador();
          
          computador.ligar();
          computador.desligar();
          televisao.ligar();
          televisao.desligar();
        }
}
