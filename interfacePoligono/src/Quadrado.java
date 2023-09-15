public class Quadrado implements Poligono{
    private double lado;
    private double lado2;

    public Quadrado(double lado, double lado2) {
        this.lado = lado;
        this.lado2 = lado2;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    @Override
    public double calcArea(){
      return (this.lado * this.lado2);
    };
    @Override
    public double calcPerimetro(){
      return (this.lado * 4);
    };
}
