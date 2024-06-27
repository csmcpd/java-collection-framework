package SetTutorial.SetOperacoesBasicas.SetOperacoesBassicasDesafioConjuntoPalavrasUnicas;

import java.util.Objects;

public class Conjunto {

    private String palavra;

    public Conjunto(String palavra) {
        this.palavra = palavra;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    
    /*equals and hashcode define que o codigoConvite será único*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Conjunto conjunto)) return false;
        return Objects.equals(getPalavra(), conjunto.getPalavra()) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPalavra());
    }
    /* ------------------------------------*/

    @Override
    public String toString() {
        return "Conjunto [palavra=" + palavra + "]";
    }

    
}
