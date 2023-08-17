public class Main {
    public static void main(String[] args) {
        Cidadao cidadao = new Cidadao();
        Buraco buraco = new Buraco();
        DanosRelatados danosRelatados = new DanosRelatados();
        EquipeReparo equipeReparo = new EquipeReparo();
        DepartamentoPublico departamentoPublico = new DepartamentoPublico();
        OrdemServico ordemServico = new OrdemServico();

        cidadao.setNome("Nome");
        cidadao.setIdade(18);
        cidadao.setEndereco("Endereco");
        cidadao.setIptu("123");
        cidadao.setTelefone("459999999");
        System.out.println(cidadao.getNome());
        System.out.println(cidadao.toString());
    }
}