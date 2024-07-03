package ListTutorial.OperacoesBasicas;

public class TesteTarefa {
    public static void main(String[] args) throws Exception {
        ListaTarefa lista = new ListaTarefa();
        lista.adicionarTarefa("tarefa 1");
        lista.adicionarTarefa("Tarefa 2");
        lista.adicionarTarefa("Tarefa 3");
        lista.adicionarTarefa("Tarefa 3");
        lista.adicionarTarefa("tarefa 1");
        lista.adicionarTarefa("Tarefa 3");

        System.out.println("Número total de tarefas " + lista.obterNumeroTotalTarefas() + "\n");

        lista.obterDescricoesTarefas();
    }
}
