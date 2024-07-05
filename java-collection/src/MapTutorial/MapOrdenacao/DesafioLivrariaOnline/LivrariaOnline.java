package MapTutorial.MapOrdenacao.DesafioLivrariaOnline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LivrariaOnline {

    private Map<String, Livro> livrariaMap;

    public LivrariaOnline() {
        this.livrariaMap = new HashMap<>();
    }

    /*
     * Adiciona um livro à livraria, utilizando o ISBN como chave no Map.
     */
    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        livrariaMap.put(autor, new Livro(titulo, autor, preco));
    }

    /*
     * Remove um livro da livraria, dado o titulo do livro.
     */
    public void removerLivro(String titulo) {
        if (!livrariaMap.isEmpty()) {
            livrariaMap.remove(titulo);
        }
    }

    /*
     * Exibe os livros da livraria em ordem crescente de preço.
     */
    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        List<Map.Entry<String, Livro>> livrosOrdenadosPorPreco = new ArrayList<>(livrariaMap.entrySet());

        Collections.sort(livrosOrdenadosPorPreco, new ComparatorPorPreco());

        Map<String, Livro>livrosOrdenadosPorPrecoPronto = new HashMap<>();

        for (Map.Entry<String,Livro> entry : livrosOrdenadosPorPreco) {
            livrosOrdenadosPorPrecoPronto.put(entry.getKey(), entry.getValue());
        }

        return livrosOrdenadosPorPrecoPronto;
    }

    /*
     * Retorna uma lista de todos os livros escritos por um determinado autor.
     */
    public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
        HashMap<String, Livro> livroPorAutor = new HashMap<>();

        for (Map.Entry<String, Livro> entry  : livrariaMap.entrySet()) {
            Livro livro = entry.getValue();

            if (livro.getAutor().equals(autor)) {
                livroPorAutor.put(entry.getKey(), livro);
            }
        }

        return livroPorAutor;
    }

    /*
     * Retorna o livro mais caro disponível na livraria.
     */
    public void obterLivroMaisCaro() {
        
    } 
}
