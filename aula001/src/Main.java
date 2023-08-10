public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("chevrolet", "cruze");
        Carro carro1 = new Carro("kia", "sportage");


        carro.escreveCarro();
        System.out.println(carro1.getMarca());
        System.out.println(carro1.getModelo());

    }
}