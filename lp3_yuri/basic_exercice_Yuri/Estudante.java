public class Estudante {

    private String nome;
    private int idade;
    private double nota;
    
    public Estudante(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }
    
    public boolean aprovado() {
        return nota >= 7.0;
    }
    
    public static void main(String[] args) {
        Estudante estudante = new Estudante("João", 20, 8.5);
        
        if (estudante.aprovado()) {
            System.out.println(estudante.nome + estudante.idade + " foi aprovado!");
        } else {
            System.out.println(estudante.nome + estudante.idade + " foi reprovado!");
        }
    }
}
