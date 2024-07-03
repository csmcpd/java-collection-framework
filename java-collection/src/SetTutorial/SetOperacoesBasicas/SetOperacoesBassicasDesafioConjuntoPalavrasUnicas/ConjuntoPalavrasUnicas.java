package SetTutorial.SetOperacoesBasicas.SetOperacoesBassicasDesafioConjuntoPalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<Conjunto> conjuntoSet;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoSet = new HashSet<Conjunto>();
    }

    /*
     * Adiciona uma palavra ao conjunto.
     */
    public void adicionarPalavra(String palavra) {
        conjuntoSet.add(new Conjunto(palavra));
    }

    /*
     * Remove uma palavra do conjunto.
     */
    public void removerPalavra(String palavra) {
        Conjunto palavraParaRemover = null;

        for (Conjunto conjunto : conjuntoSet) {
            if (conjunto.getPalavra() == palavra) {
                palavraParaRemover = conjunto;
                break;
            }
        }

        conjuntoSet.remove(palavraParaRemover);
    }

    /*
     * Verifica se uma palavra está presente no conjunto.
     */
    public void verificarPalavra(String palavra) {

        if (conjuntoSet.isEmpty() == false) {
            for (Conjunto conjunto : conjuntoSet) {
                if (conjunto.getPalavra().equals(palavra)) {
                    System.out.println("Palavra " + conjunto.getPalavra() + " foi encontrada");
                    break;
                } else {
                    System.out.println("Não foi encontrado a palavra no conjunto");
                }
            }
        } else {
            System.out.println("Conjunto vazio");
        }
        
    }

    /*
     * Exibe todas as palavras únicas do conjunto.
     */
    public void exibirPalavrasUnicas() {
        System.out.println(conjuntoSet);
    }

}
