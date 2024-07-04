package SetTutorial.SetPesquisa.DesafioListaDeTarefas;

public class TesteTarefas {
    public static void main(String[] args) {
        ListaTarefas tarefaSet = new ListaTarefas();

        tarefaSet.adicionarTarefa("Tarefa 1", false);
        tarefaSet.adicionarTarefa("Tarefa 4", true);
        tarefaSet.adicionarTarefa("Tarefa 1", false);
        tarefaSet.adicionarTarefa("Tarefa 8", true);
        tarefaSet.adicionarTarefa("Tarefa 9", true);
        tarefaSet.adicionarTarefa("Tarefa 10", true);

        tarefaSet.exibirTarefas();

        tarefaSet.removerTarefa("Tarefa 4");

        tarefaSet.exibirTarefas();

        tarefaSet.contarTarefas();

        System.out.println(tarefaSet.obterTarefasConcluidas());

        System.out.println(tarefaSet.obterTarefasPendentes());

        tarefaSet.marcarTarefaConcluida("Tarefa 10");

        tarefaSet.marcarTarefaPendente("Tarefa 10");

        tarefaSet.limparListaTarefas();

        tarefaSet.exibirTarefas();
    }
}