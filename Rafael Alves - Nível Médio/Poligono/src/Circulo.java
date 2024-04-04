public class Circulo extends Poligono{
    double raio;
    public Circulo (double raio){
        this.raio = raio;
    }
    public double area(){
        return Math.PI * raio;
    }
}
