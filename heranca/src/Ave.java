public class Ave extends Animal{
    private String voa;

    public Ave(String nome, String comprimento, String numero_patas, String cor, String ambiente, String velocidade_media, String voa) {
        super(nome, comprimento, numero_patas, cor, ambiente, velocidade_media);
        this.voa = voa;
    }

    public String getVoa() {
        return voa;
    }

    public void setVoa(String voa) {
        this.voa = voa;
    }

    @Override
    public String toString() {
        return "Ave{" +
                "voa='" + voa + '\'' +
                "} " + super.toString();
    }

    void dados(){
        System.out.printf("ave");
    }
}
