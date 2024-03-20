package aula3.exercicio5;

public class Televisao implements DispositivoEletronico {
    @Override
    public void desligar() {
        System.out.println("Eu sou uma televisão, portanto eu desligo como uma.");
    }

    @Override
    public void ligar() {
        System.out.println("Eu sou uma televisão, portanto eu ligo como uma.");   
    }
}
