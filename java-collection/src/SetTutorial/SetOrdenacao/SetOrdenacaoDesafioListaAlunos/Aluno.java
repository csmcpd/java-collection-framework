package SetTutorial.SetOrdenacao.SetOrdenacaoDesafioListaAlunos;

import java.util.Objects;

public class Aluno implements Comparable<Aluno>{

    private String nome;
    private long matricula;
    private double nota;
    
    public Aluno(String nome, long matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    @Override
    public int compareTo(Aluno a) {
        return nome.compareToIgnoreCase(a.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    /* equals and hashcode define que o codigoConvite será único */
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Aluno aluno))
            return false;
        return getMatricula() == aluno.getMatricula();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMatricula());
    }
    /* ------------------------------------ */

    @Override
    public String toString() {
        return "Aluno = nome: " + nome 
        + ", matricula: " + matricula 
        + ", nota: " + nota + "\n";
    }
  
}
