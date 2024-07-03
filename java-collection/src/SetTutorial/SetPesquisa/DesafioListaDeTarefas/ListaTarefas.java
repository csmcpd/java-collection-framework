package SetTutorial.SetPesquisa.DesafioListaDeTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    /*
     * Adiciona uma nova tarefa ao Set.
     */
    public void adicionarTarefa(String descricao, boolean status) {
        tarefaSet.add(new Tarefa(descricao, status));
    }

    /*
     *  Remove uma tarefa do Set de acordo com a descrição, se estiver presente.
     */
    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;

        for (Tarefa tarefa : tarefaSet) {
            if (tarefa.getDescricao().equals(descricao)) {
                tarefaParaRemover = tarefa;
                break;
            }
        }

        tarefaSet.remove(tarefaParaRemover);
    }

    /*
     * Exibe todas as tarefas da lista de tarefas.
     */
    public void exibirTarefas() {
        System.out.println(tarefaSet);
    }

    /*
     * Conta o número total de tarefas na lista de tarefas.
     */
    public void contarTarefas() {
        System.out.println(tarefaSet.size());
    }

    /*
     * Retorna um Set com as tarefas concluídas.
     */
    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefaConcluida = new HashSet<>();

        for (Tarefa tarefa : tarefaSet) {
            if (tarefa.isTarefaConcluida() == true) {
                tarefaConcluida.add(tarefa);
            }
        }

        return tarefaConcluida;
    }

    /*
     * Retorna um Set com as tarefas pendentes.
     */
    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefaPendente = new HashSet<>();

        for (Tarefa tarefa : tarefaSet) {
            if (tarefa.isTarefaConcluida() == false) {
                tarefaPendente.add(tarefa);
            }
        }

        return tarefaPendente;
    }

    /*
     *  Marca uma tarefa como concluída de acordo com a descrição.
     */
    public void marcarTarefaConcluida(String descricao) {
        if (tarefaSet.isEmpty() == false) {
            for (Tarefa tarefa : tarefaSet) {
                if (tarefa.getDescricao().equals(descricao)) {
                    if (tarefa.isTarefaConcluida() == false) {
                        tarefa.setTarefaConcluida(true);
                        System.out.println("Tarefa " + tarefa.getDescricao() + " marcada como concluida");
                        break;
                    } else {
                        System.out.println("Tarefa já estava concluida");
                        break;
                    }
                } else {System.out.println("Estamos procurando na lista");}
            }
        } else {
            System.out.println("Lista estaq vazia");
        }
    }

    /*
     * Marca uma tarefa como pendente de acordo com a descrição.
     */
    public void marcarTarefaPendente(String descricao) {
        if (tarefaSet.isEmpty() == false) {
            for (Tarefa tarefa : tarefaSet) {
                if (tarefa.getDescricao().equals(descricao)) {
                    if (tarefa.isTarefaConcluida() == true) {
                        tarefa.setTarefaConcluida(false);
                        System.out.println("Tarefa " + tarefa.getDescricao() + " pendente");
                        break;
                    } else {
                        System.out.println("Tarefa já estava pendente");
                    }
                }
            }
        }
    }

    /*
     * Remove todas as tarefas da lista de tarefas.
     */
    public void limparListaTarefas() {
        tarefaSet = null;

        if (tarefaSet.isEmpty()) {
            System.out.println("");
        } else {
            System.out.println("Tarefa ainda continua cheia");
        }

    }
}
