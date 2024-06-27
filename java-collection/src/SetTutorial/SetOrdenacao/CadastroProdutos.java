package SetTutorial.SetOrdenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, quantidade, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtoPorOrdenAlfabetica = new TreeSet<>(produtoSet);

        return produtoPorOrdenAlfabetica;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtoPreco = new TreeSet<>(new ComparatorPorPreco());

        return produtoPreco;
    }
}
