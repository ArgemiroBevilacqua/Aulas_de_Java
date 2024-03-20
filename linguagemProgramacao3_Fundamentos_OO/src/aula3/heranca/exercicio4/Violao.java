package aula3.heranca.exercicio4;

public class Violao extends InstrumentoMusical {

    @Override
    protected void tocar() {
        System.out.println("Este é o som de um violão sendo tocado...");
    }

    @Override
    protected void afinar() {
        System.out.println("Este é o método de um violão para ser afinado...");
    }
    
}
