public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("chevrolet", "cruze");
        Carro carro1 = new Carro("kia", "sportage");
        Proprietario proprietario1 = new Proprietario("ABLA", "123456");
        Proprietario proprietario2 = new Proprietario("ZLD", "654321");

        carro.setProprietario(proprietario1);
        carro1.setProprietario(proprietario2);

        carro.escreveCarro();
        System.out.println(carro.getProprietario().getCpf());
        System.out.println(carro.getProprietario().getNome());

        carro1.escreveCarro();
        System.out.println(carro1.getProprietario().getCpf());
        System.out.println(carro1.getProprietario().getNome());


    }
}