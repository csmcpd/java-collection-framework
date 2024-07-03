package SetTutorial.SetOperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

/*
 * A interface Set é uma coleção que não pode 
 * conter elementos duplicados.
 * 
 * Essa interface representa o conceito matemático 
 * de um conjunto e é usada para representar conjuntos, 
 * como um baralho de cartas.
 * 
 * A plataforma Java possui três implementações 
 * de Set de uso geral: HashSet, TreeSet e LinkedHashSet.
 * 
 * A interface Set não permite acesso aleatório a um elemento na coleção.
 * 
 * Para percorrer os elementos de um Set, você pode usar um iterador 
 * ou um loop foreach.
 * 
 * HashSet: O HashSet é uma implementação da interface Set 
 * que armazena os elementos em uma tabela hash. Ele não 
 * mantém uma ordem específica dos elementos. 
 * A principal vantagem do HashSet é que ele oferece 
 * um desempenho de busca muito eficiente, pois usa 
 * funções hash para indexar os elementos. No entanto, 
 * a ordem em que os elementos são adicionados pode 
 * não ser preservada ao percorrer o conjunto.
 * 
 * TreeSet: O TreeSet é uma implementação da interface Set 
 * que armazena os elementos em uma árvore binária balanceada.
 * Isso significa que os elementos são armazenados em uma ordem 
 * classificada e são mantidos automaticamente em ordem crescente. 
 * A principal vantagem do TreeSet é que os elementos são sempre 
 * retornados na ordem classificada, o que facilita a obtenção 
 * de elementos em uma determinada ordem. No entanto, a busca 
 * e a inserção são um pouco mais lentas em comparação com o HashSet.
 */
public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;
    
    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<Convidado>();
    }

    /*
     * Adiciona um convidado ao conjunto.
     */
    public void adicionarConvidado(String nome, int codigoConvite) {
      convidadoSet.add(new Convidado(nome, codigoConvite));  
    }
    
    /*
     * Remove um convidado do conjunto com base no código do convite.
     */
    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado codigoParaRemover = null;

        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                codigoParaRemover = c;
                break;
            } else {
                System.out.println("Código de convite não existe");
            }
        }
        convidadoSet.remove(codigoParaRemover);
    }

    /*
     * Conta o número total de convidados no Set.
     */
    public int contarConvidados() {
        return convidadoSet.size();
    }

    /*
     * Exibe todos os convidados do conjunto.
     */
    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }
}
