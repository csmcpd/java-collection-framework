package SetTutorial.SetPesquisa;

import java.util.Objects;

public class Contato {

    private String nome;
    private long numeroTelefone;

    public Contato(String nome, long numeroTelefone) {
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(long numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    /* equals and hashcode define que o codigoConvite será único */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return Objects.equals(getNome(), contato.getNome()) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }
    /* ------------------------------------ */

    @Override
    public String toString() {
        return "Contato = nome: " + nome + ", numeroTelefone: " + numeroTelefone + "\n";
    }

}
