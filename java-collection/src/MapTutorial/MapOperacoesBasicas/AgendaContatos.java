package MapTutorial.MapOperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

/*
 * A interface Map é usada para mapear dados na forma de chaves e valores.
 * 
 * O Map do Java é um objeto que mapeia chaves para valores.
 * 
 * Um Map não pode conter chaves duplicadas: cada chave pode mapear no máximo um valor.
 * 
 * A plataforma Java possui três implementações gerais de Map: HashMap, TreeMap e LinkedHashMap.
 * 
 * As operações básicas do Map são: 
 * put (inserir ou atualizar), 
 * get (obter), 
 * containsKey (verificar se contém uma chave), 
 * containsValue (verificar se contém um valor), 
 * size (obter o tamanho) e 
 * isEmpty (verificar se está vazio).
 * 
 * HashMap é uma implementação da interface Map 
 * que não mantém uma ordem específica dos elementos. 
 * Ele armazena os elementos internamente usando uma 
 * função de hash para melhorar a eficiência das 
 * operações de pesquisa e acesso. O HashMap também 
 * permite chaves ou valores nulos.
 */
public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    /*
     * Adiciona um contato à agenda, associando o nome do contato 
     * ao número de telefone correspondente.
     */
    public void adicionarContato(String nome, Integer contato) {
        agendaContatoMap.put(nome, contato);
    }    

    /*
     * Remove um contato da agenda, dado o nome do contato.
     */
    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    /*
     * Exibe todos os contatos da agenda, mostrando 
     * o nome e o número de telefone de cada contato.
     */
    public void exibirContato() {
        System.out.println(agendaContatoMap);
    }

    /*
     * Pesquisa um contato pelo nome e retorna o número de telefone correspondente.
     */
    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = 0;
        
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;   
    }
}
