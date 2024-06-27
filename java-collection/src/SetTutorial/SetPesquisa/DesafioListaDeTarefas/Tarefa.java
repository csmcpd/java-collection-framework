package SetTutorial.SetPesquisa.DesafioListaDeTarefas;

import java.util.Objects;

public class Tarefa {

    private String descricao;
    private boolean tarefaConcluida;

    

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public Tarefa(String descricao, boolean tarefaConcluida) {
        this.descricao = descricao;
        this.tarefaConcluida = tarefaConcluida;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isTarefaConcluida() {
        return tarefaConcluida;
    }

    public void setTarefaConcluida(boolean tarefaConcluida) {
        this.tarefaConcluida = tarefaConcluida;
    }

    /* equals and hashcode define que o codigoConvite será único */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarefa tarefa)) return false;
        return Objects.equals(getDescricao(), tarefa.getDescricao()) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescricao());
    }
    /* ------------------------------------ */

    @Override
    public String toString() {
        return "Tarefa = descricao: " + descricao 
        + ", tarefaConcluida=" 
        + tarefaConcluida + "\n";
    }

    
    
}
