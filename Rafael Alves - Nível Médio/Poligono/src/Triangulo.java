public class Triangulo extends Poligono {
    double base, altura;
    public Triangulo (double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public double area(){
        return (base * altura) / 2;
    }
}
