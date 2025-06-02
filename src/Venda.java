import java.util.ArrayList;
import java.util.List;

public class Venda {
    private Cliente cliente;
    private List<Produto> produtos;
    private double valorTotal;

    public Venda(Cliente cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
        this.valorTotal = 0.0;
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        if (produto.reduzirEstoque(quantidade)) {
            for (int i = 0; i < quantidade; i++) {
                produtos.add(produto);
            }
            valorTotal += produto.getPreco() * quantidade;
            System.out.println(quantidade + "x " + produto.getNome() + " adicionado(s) à venda.");
        } else {
            System.out.println("Estoque insuficiente para " + produto.getNome());
        }
    }

    public void exibirResumo() {
        System.out.println("\n--- Venda ---");
        cliente.exibirInformacoes();
        System.out.println("Produtos:");
        for (Produto p : produtos) {
            System.out.println("- " + p.getNome() + " - R$" + p.getPreco());
        }
        System.out.println("Total: R$" + valorTotal);
    }
}
