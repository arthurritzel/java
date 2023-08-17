public class Proprietario {
    public String nome;
    public String cpf;


    //constructor
    public Proprietario(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    //get/set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }




}
