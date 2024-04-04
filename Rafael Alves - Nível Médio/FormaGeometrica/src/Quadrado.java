public class Quadrado implements FormaGeometrica {
    double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }
    public double calcularArea(){
        return lado * lado;
    }
    public double calcularPerimetro(){
        return lado * 4;
    }
}
