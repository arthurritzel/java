public class Telefone {
    private String numero;
    private String operadora;


    public Telefone(String numero, String operadora) {
        this.numero = numero;
        this.operadora = operadora;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public void escreveAtr(){
        System.out.println("Numero: " + this.numero);
        System.out.println("Operadora: " + this.operadora);
    }

}
