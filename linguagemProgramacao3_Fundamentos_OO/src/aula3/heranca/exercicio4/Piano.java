package aula3.heranca.exercicio4;

public class Piano extends InstrumentoMusical {

    @Override
    protected void afinar() {
        System.out.println("Este é o som de um piano sendo afinado...");
    }

    @Override
    protected void tocar() {
        System.out.println("Este é o som de um piano sendo tocado...");
        
    }
    
}
