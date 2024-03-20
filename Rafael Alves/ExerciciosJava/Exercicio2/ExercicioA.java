import java.util.*;


class Planta {
    
    void fotossintese() {
        
        System.out.println("Fazendo fotossíntese!");
    }
    
}

class Flor extends Planta {
    
    void fotossintese() {
        
        System.out.println("Fazendo fotossíntese sendo uma flor!");
    }
    
}


class Arvore extends Planta {
    
    void fotossintese() {
        
        System.out.println("Fazendo fotossíntese sendo uma árvore!");
    }
    
}


public class Main {
        public static void main(String[] args) {
          Planta planta = new Planta();
          Flor flor = new Flor();
          Arvore arvore = new Arvore();
          
          planta.fotossintese();
          flor.fotossintese();
          arvore.fotossintese();
        }
}
