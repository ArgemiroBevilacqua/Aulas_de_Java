package aula3.heranca.exercicio4;

public class Main {
    public static void main(String[] args) {
        Piano yamaha = new Piano();
        yamaha.afinar();
        yamaha.tocar();

        Violao marcaTal = new Violao();
        marcaTal.afinar();
        marcaTal.tocar();
    }
}
