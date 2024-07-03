package SetTutorial.SetOrdenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    /*
     * Adiciona um produto ao cadastro.
     */
    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, quantidade, preco, quantidade));
    }

    /*
     * Exibe todos os produtos do cadastro em ordem alfabética pelo nome.
     */
    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtoPorOrdenAlfabetica = new TreeSet<>(produtoSet);

        return produtoPorOrdenAlfabetica;
    }

    /*
     * Exibe todos os produtos do cadastro em ordem crescente de preço.
     */
    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtoPreco = new TreeSet<>(new ComparatorPorPreco());

        produtoPreco.addAll(produtoSet);
        return produtoPreco;
    }
}
