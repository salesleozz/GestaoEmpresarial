public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Tech Solutions");

        // Cadastrando funcionários
        Funcionario f1 = new Funcionario("Carlos Silva", "12345678900", "carlos@tech.com", "Vendedor", 3000);
        empresa.adicionarFuncionario(f1);

        // Cadastrando clientes
        Cliente c1 = new Cliente("Ana Costa", "98765432100", "ana@gmail.com", "11999999999");
        empresa.adicionarCliente(c1);

        // Cadastrando produtos
        Produto p1 = new Produto("Notebook", 3500.00, 10);
        Produto p2 = new Produto("Mouse", 50.00, 100);
        empresa.adicionarProduto(p1);
        empresa.adicionarProduto(p2);

        // Realizando uma venda
        Venda venda1 = new Venda(c1);
        venda1.adicionarProduto(p1, 1);
        venda1.adicionarProduto(p2, 2);

        venda1.exibirResumo();
        empresa.realizarVenda(venda1);

        // Listagem
        empresa.listarFuncionarios();
        empresa.listarClientes();
        empresa.listarProdutos();
    }
}
