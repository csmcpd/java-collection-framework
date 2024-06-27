package SetTutorial.SetOperacoesBasicas.SetOperacoesBassicasDesafioConjuntoPalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<Conjunto> conjuntoSet;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoSet = new HashSet<Conjunto>();
    }

    public void adicionarPalavra(String palavra) {
        conjuntoSet.add(new Conjunto(palavra));
    }

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

    public void exibirPalavrasUnicas() {
        System.out.println(conjuntoSet);
    }

}
