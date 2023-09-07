public abstract class Animal {
    private String nome;
    private String comprimento;
    private String numero_patas;
    private String cor;
    private String ambiente;
    private String velocidade_media;


    private  Animal(){

    }
    public Animal(String nome, String comprimento, String numero_patas, String cor, String ambiente, String velocidade_media) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numero_patas = numero_patas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade_media = velocidade_media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getComprimento() {
        return comprimento;
    }

    public void setComprimento(String comprimento) {
        this.comprimento = comprimento;
    }

    public String getNumero_patas() {
        return numero_patas;
    }

    public void setNumero_patas(String numero_patas) {
        this.numero_patas = numero_patas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public String getVelocidade_media() {
        return velocidade_media;
    }

    public void setVelocidade_media(String velocidade_media) {
        this.velocidade_media = velocidade_media;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", comprimento='" + comprimento + '\'' +
                ", numero_patas='" + numero_patas + '\'' +
                ", cor='" + cor + '\'' +
                ", ambiente='" + ambiente + '\'' +
                ", velocidade_media='" + velocidade_media + '\'' +
                '}';
    }

    void dados(){
        System.out.printf("animal");
    }
}
