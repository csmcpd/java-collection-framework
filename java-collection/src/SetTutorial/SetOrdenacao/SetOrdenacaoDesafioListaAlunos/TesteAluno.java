package SetTutorial.SetOrdenacao.SetOrdenacaoDesafioListaAlunos;

public class TesteAluno {
    public static void main(String[] args) {

        GerenciadorAlunos gerAluno = new GerenciadorAlunos();

       gerAluno.adicionarAluno("Cristiano", 111111, 9.9);
       gerAluno.adicionarAluno("Legal", 222222, 7.9);
       gerAluno.adicionarAluno("Cristiano", 333333, 8.9);
       gerAluno.adicionarAluno("Cristiano", 444444, 3.9);

       //gerAluno.removerAluno(444444);

       System.out.println("Alunos ordenados por nome \n" + gerAluno.exibirAlunosPorNome());  
       
       System.out.println("Alunos ordenados por nota \n" + gerAluno.exibirAlunosPorNota());

       gerAluno.exibirAlunos();
    }
}
