package MapTutorial.MapPesquisas;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    /*
     * Adiciona um produto ao estoque, juntamente com a
     * quantidade disponível e o preço.
     */
    public void adicionarProduto(Long codigo, String nome, int quantidade, double valor) {
        estoqueProdutosMap.put(codigo, new Produto(nome, quantidade, valor));
    }

    /*
     * Exibe todos os produtos, suas quantidades em estoque e preços.
     */
    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    /*
     * Calcula e retorna o valor total do estoque,
     * considerando a quantidade e o preço de cada produto.
     */
    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;

        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getValor() * p.getQuantidade();
            }
        }

        return valorTotalEstoque;
    }

    /*
     * Retorna o produto mais caro do estoque,
     * ou seja, aquele com o maior preço.
     */
    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;

        double maiorPreco = Double.MIN_VALUE;

        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto produto : estoqueProdutosMap.values()) {
                if (produto.getValor() > maiorPreco) {
                    produtoMaisCaro = produto;
                }
            }
        }

        return produtoMaisCaro;
    }

    /*
     * public Produto obterProdutoMaisCaro() {
     * Produto produtoMaisCaro = null;
     * 
     * double maiorPreco = 0;
     * 
     * if (!estoqueProdutosMap.isEmpty()) {
     * for (Produto produto : estoqueProdutosMap.values()) {
     * if (produto.getValor() > maiorPreco) {
     * maiorPreco = produto.getValor();
     * produtoMaisCaro = produto;
     * }
     * }
     * }
     * 
     * return produtoMaisCaro;
     * }
     */

    /*
     * Retorna o produto mais barato do estoque,
     * ou seja, aquele com o menor preço.
     */
    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;

        double menorPreco = Double.MAX_VALUE;
        for (Produto p : estoqueProdutosMap.values()) {
            if (p.getValor() < menorPreco) {
                produtoMaisBarato = p;
                menorPreco = p.getValor();
            }
        }
        
        return produtoMaisBarato;
    }

    /*
     * Retorna o produto que está em maior quantidade no estoque,
     * considerando o valor total de cada produto (quantidade * preço).
     */
    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorNoEstoque = null;
        double maiorValorTotalProdutoEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet()) {
                double valorProdutoEmEstoque = entry.getValue().getValor() * entry.getValue().getQuantidade();
                if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
                    maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
                    produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
                }
            }
        }
        return produtoMaiorQuantidadeValorNoEstoque;
    }
}
