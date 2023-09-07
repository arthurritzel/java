public class Mamifero extends Animal{
    private String alimento;

    public Mamifero(String nome, String comprimento, String numero_patas, String cor, String ambiente, String velocidade_media, String alimento) {
        super(nome, comprimento, numero_patas, cor, ambiente, velocidade_media);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return "Mamifero{" +
                "alimento='" + alimento + '\'' +
                "} " + super.toString();
    }
}

