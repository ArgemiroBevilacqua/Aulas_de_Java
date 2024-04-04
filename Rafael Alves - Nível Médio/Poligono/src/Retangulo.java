class Retangulo extends Poligono {
    double base, altura;

    public Retangulo (double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public double area(){
        return base * altura;
    }
}
