package EX03;

// Definindo a interface
interface Animal {

  void comer();
  void dormir();

}

// Implementando a interface em uma classe
class Cachorro implements Animal {

  // Implementando os métodos da interface
  public void comer() {
      System.out.println("O cachorro está comendo");
  }

  public void dormir() {
      System.out.println("O cachorro está dormindo");
  }

}


