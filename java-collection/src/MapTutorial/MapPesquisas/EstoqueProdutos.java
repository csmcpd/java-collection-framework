package MapTutorial.MapPesquisas;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(Long codigo, String nome, int quantidade, double valor) {
        estoqueProdutosMap.put(codigo, new Produto(nome, quantidade, valor));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;

        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getValor() * p.getQuantidade();
            }
        }

        return valorTotalEstoque;
    }

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
     public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;

        double maiorPreco = 0;

        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto produto : estoqueProdutosMap.values()) {
                if (produto.getValor() > maiorPreco) {
                    maiorPreco = produto.getValor();
                    produtoMaisCaro = produto;
                }
            }
        }   

        return produtoMaisCaro;
    }
    */
    
}
