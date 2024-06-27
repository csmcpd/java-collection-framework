package SetTutorial.SetPesquisa.DesafioListaDeTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao, boolean status) {
        tarefaSet.add(new Tarefa(descricao, status));
    }

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

    public void exibirTarefas() {
        System.out.println(tarefaSet);
    }

    public void contarTarefas() {
        System.out.println(tarefaSet.size());
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefaConcluida = new HashSet<>();

        for (Tarefa tarefa : tarefaSet) {
            if (tarefa.isTarefaConcluida() == true) {
                tarefaConcluida.add(tarefa);
            }
        }

        return tarefaConcluida;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefaPendente = new HashSet<>();

        for (Tarefa tarefa : tarefaSet) {
            if (tarefa.isTarefaConcluida() == false) {
                tarefaPendente.add(tarefa);
            }
        }

        return tarefaPendente;
    }

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

    public void limparListaTarefas() {
        tarefaSet = null;

        if (tarefaSet.isEmpty()) {
            System.out.println("");
        } else {
            System.out.println("Tarefa ainda continua cheia");
        }

    }
}
