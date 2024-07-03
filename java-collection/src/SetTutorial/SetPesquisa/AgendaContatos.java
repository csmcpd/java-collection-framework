package SetTutorial.SetPesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;
    
    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    /*
     * Adiciona um contato à agenda.
     */
    public void adicionarContato(String nome, long numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    /*
     * Exibe todos os contatos da agenda.
     */
    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    /*
     * Pesquisa contatos pelo nome e retorna 
     * um conjunto com os contatos encontrados.
     */
    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatoPorNome = new HashSet<>();

        for (Contato contato : contatoSet) {
            if (contato.getNome().startsWith(nome)) {
                contatoPorNome.add(contato);
            }
        }

        return contatoPorNome;
    }

    /*
     * Atualiza o número de telefone de um contato específico.
     */
    public Contato atualizarNumeroContato(String nome, long novoNumero) {
        Contato contatoAtualizado = null;

        for (Contato contato : contatoSet) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumeroTelefone(novoNumero);
                contatoAtualizado = contato;
                break;
            }
        }

        return contatoAtualizado;
    }
}
