// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Contato contato = new Contato("Arthur", "rit@gmail.com");


        contato.setEndereco(new Endereco("maringa", "2233", "LASALLE", "toledo", "parana"));
        contato.setTelefone(new Telefone("9999-9999", "claro"));

        System.out.println("Nome: " + contato.getNome());
        System.out.println("Email: " + contato.getEmail());
        contato.getTelefone().escreveAtr();
        contato.getEndereco().escreveAtr();



    }
}