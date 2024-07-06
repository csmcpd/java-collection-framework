package MapTutorial.MapPesquisas;

public class TesteProdutos {
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(1L, "Produto A", 4, 4.9);
        estoque.adicionarProduto(2L, "Produto B", 4, 100.9);
        estoque.adicionarProduto(3L, "Produto C", 7, 12.9);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque " +estoque.calcularValorTotalEstoque());

        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());

        System.out.println("Produto maior valor no estoque: " + estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque() );
    }
}
