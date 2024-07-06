package MapTutorial.MapPesquisas.DesafioContagemDePalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> palavraMap;

    public ContagemPalavras() {
        this.palavraMap = new HashMap<>();
    }

    /*
     * Adiciona uma palavra à contagem.
     */
    public void adicionarPalavra(String palavra, Integer contagem) {
        palavraMap.put(palavra, contagem);
    }

    /*
     * Remove uma palavra da contagem, se estiver presente.
     */
    public void removerPalavra(String palavra) {
        if (palavraMap.containsKey(palavra)) {
            palavraMap.remove(palavra);
            System.out.println("Palavra removida do mapa com sucesso");
        } else {
            System.out.println("Palavra não encontrada no mapa");
        }
    }

    /*
     * Exibe todas as palavras e suas respectivas contagens.
     */
    public void exibirContagemPalavras() {
        System.out.println(palavraMap);
    }

    /*
     * Encontra a palavra mais frequente no texto 
     * e retorna a palavra e sua contagem.
     */
    public Map<String, Integer> encontrarPalavraMaisFrequente() {
        Map<String, Integer> palavraMaisFrequente = new HashMap<>();

        int cont = 0;
    
        for (String i : palavraMap.keySet()) {
            if (palavraMap.get(i) > cont) {
                cont = palavraMap.get(i);
                palavraMaisFrequente.clear();
                palavraMaisFrequente.put(i, cont);               
            }
        }
        
        return palavraMaisFrequente;
    }
}
