package SetTutorial.SetOrdenacao.SetOrdenacaoDesafioListaAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    /*
     * Adiciona um aluno ao conjunto.
     */
    public void adicionarAluno(String nome, long matricula, double media) {
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    /*
     * Remove um aluno ao conjunto a partir da matricula, se estiver presente.
     */
    public void removerAluno(long matricula) {
        Aluno alunoParaRemover = null;
        Aluno alunoVazio = null;

        if (alunoSet.isEmpty() == false) {
            for (Aluno aluno : alunoSet) {
                if (aluno.getMatricula() == matricula) {
                    alunoParaRemover = aluno;
                    break;
                }
            }
        } else {
            System.out.println("Conjunto sem alunos, vazio");
        }
        
        if (alunoParaRemover != alunoVazio) {
            System.out.println("Aluno " +alunoParaRemover.getNome() 
            + " com matrícula " + alunoParaRemover.getMatricula() 
            +  " removido com sucesso");

            alunoSet.remove(alunoParaRemover);
        } else {
            System.out.println("Não foi encontrado aluno para remover");
        }
        
    }

    /*
     * Exibe todos os alunos do conjunto em ordem alfabética pelo nome.
     */
    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunoOrdemAlfabetica = new TreeSet<>(alunoSet);
        
        return alunoOrdemAlfabetica;
    }

    /*
     * Exibe todos os alunos do conjunto em ordem crescente de nota.
     */
    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunoPorNotaOrdemCrescente = new TreeSet<>(new ComparatorPorNota());

        alunoPorNotaOrdemCrescente.addAll(alunoSet);

        return alunoPorNotaOrdemCrescente;
    }

    /*
     * Exibe todos os alunos do conjunto.
     */
    public void exibirAlunos() {
        System.out.println("Todos os alunos " +alunoSet);
    }
}
