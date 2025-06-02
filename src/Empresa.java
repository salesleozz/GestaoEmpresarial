import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    private List<Funcionario> funcionarios;
    private List<Cliente> clientes;
    private List<Produto> produtos;
    private List<Venda> vendas;

    public Empresa(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.produtos = new ArrayList<>();
        this.vendas = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    public void adicionarCliente(Cliente c) {
        clientes.add(c);
    }

    public void adicionarProduto(Produto p) {
        produtos.add(p);
    }

    public void realizarVenda(Venda v) {
        vendas.add(v);
    }

    public void listarFuncionarios() {
        System.out.println("\n--- Funcionários ---");
        for (Funcionario f : funcionarios) {
            f.exibirInformacoes();
            System.out.println();
        }
    }

    public void listarClientes() {
        System.out.println("\n--- Clientes ---");
        for (Cliente c : clientes) {
            c.exibirInformacoes();
            System.out.println();
        }
    }

    public void listarProdutos() {
        System.out.println("\n--- Produtos ---");
        for (Produto p : produtos) {
            p.exibirInformacoes();
            System.out.println();
        }
    }
}
