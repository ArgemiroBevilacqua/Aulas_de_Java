package aula3.exercicio5;

public class Computador implements DispositivoEletronico {
    @Override
    public void desligar() {
        System.out.println("Eu sou um computador, portanto eu desligo como uma.");
    }

    @Override
    public void ligar() {
        System.out.println("Eu sou um computador, portanto eu ligo como uma.");
    }
}
