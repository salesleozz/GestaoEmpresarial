public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cpf, String email, String cargo, double salario) {
        super(nome, cpf, email);
        this.cargo = cargo;
        this.salario = salario;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
    }
}
