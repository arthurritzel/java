public class Peixe extends Animal{
    private String caracteristica;

    public Peixe(String nome, String comprimento, String numero_patas, String cor, String ambiente, String velocidade_media, String caracteristica) {
        super(nome, comprimento, numero_patas, cor, ambiente, velocidade_media);
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    @Override
    public String toString() {
        return "Peixe{" +
                "caracteristica='" + caracteristica + '\'' +
                "} " + super.toString();
    }
}
