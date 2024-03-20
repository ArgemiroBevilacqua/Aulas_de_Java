package aula3.heranca.exercicio3;

public class Main {
	public static void main(String[] args) {
		Planta p1 = new Planta();
		p1.fotossintese();

		System.out.println();
		Flor f1 = new Flor();
		f1.fotossintese();

		System.out.println();
		Arvore a1 = new Arvore();
		a1.fotossintese();
	}
}
