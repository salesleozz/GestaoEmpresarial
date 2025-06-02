public class Cliente extends Pessoa {
    private String telefone;

    public Cliente(String nome, String cpf, String email, String telefone) {
        super(nome, cpf, email);
        this.telefone = telefone;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Telefone: " + telefone);
    }
}
