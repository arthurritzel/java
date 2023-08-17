public class Carro {

    //atributos
    public String marca;
    public String modelo;

    //proprioetario ass----------------------------------------
    private Proprietario proprietario;

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }
    //----------------------------------------------------------




    //construtor
    public Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    //GET/SET
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
