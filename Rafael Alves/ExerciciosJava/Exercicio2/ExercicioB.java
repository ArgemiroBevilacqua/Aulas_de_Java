import java.util.*;


class InstrumentoMusical {
    
    void tocar() {
        
        System.out.println("Tocando instrumento!");
    }
    
    void afinar() {
        
        System.out.println("Afinando instrumento!");
    }
    
}

class Violao extends InstrumentoMusical {
    
}


class Piano extends InstrumentoMusical {
    
}


public class Main {
        public static void main(String[] args) {
          Violao violao = new Violao();
          Piano piano = new Piano();
          
          violao.tocar();
          piano.afinar();
        }
}
