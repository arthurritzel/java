public class Carro {

    //atributos
    public String marca;
    public String modelo;



    //construtores
    public Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void escreveCarro(){
        System.out.println("Marca : " + marca + "\nModelo: " + modelo);

    }
}
