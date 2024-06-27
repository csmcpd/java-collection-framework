package SetTutorial.SetOrdenacao;

public class TesteOrdenacaoSet {
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1, "tomate cereja", 3.5, 5);
        cadastroProdutos.adicionarProduto(2, "laranja", 4.89, 8);
        cadastroProdutos.adicionarProduto(3, "pera", 13.5, 7);
        cadastroProdutos.adicionarProduto(4, "uva", 11.0, 1);
        cadastroProdutos.adicionarProduto(4, "maca", 11.0, 1);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
