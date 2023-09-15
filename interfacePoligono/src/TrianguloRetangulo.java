public class TrianguloRetangulo implements Poligono{
    private double catetoOposto;
    private double catetoAdjacente;
    private double hipotenusa;
    private double area;

    public TrianguloRetangulo(double catetoOposto, double catetoAdjacente) {
        this.catetoOposto = catetoOposto;
        this.catetoAdjacente = catetoAdjacente;
    }
    public double getCatetoOposto() {
        return catetoOposto;
    }

    public void setCatetoOposto(double catetoOposto) {
        this.catetoOposto = catetoOposto;
    }

    public double getCatetoAdjacente() {
        return catetoAdjacente;
    }

    public void setCatetoAdjacente(double catetoAdjacente) {
        this.catetoAdjacente = catetoAdjacente;
    }

    public double getHipotenusa() {
        return hipotenusa;
    }

    public void setHipotenusa(double hipotenusa) {
        this.hipotenusa = hipotenusa;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }


    @Override
    public double calcArea(){
        return (this.catetoAdjacente * this.catetoOposto) / 2;
    };
    @Override
    public double calcPerimetro(){
        if(this.hipotenusa != 0) {
            this.area =  (this.catetoOposto + this.catetoAdjacente + this.hipotenusa);
        }else {
            this.hipotenusa =  Math.sqrt(Math.pow(this.catetoAdjacente, 2) + Math.pow(this.catetoOposto, 2));
            this.area =  (this.catetoOposto + this.catetoAdjacente + this.hipotenusa);
        }
        return this.area;
    };
}
