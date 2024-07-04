package ListTutorial.Pesquisa.DesafioSomaNumeros;

public class Numero {

    private int numeroInteiro;

    public Numero(int numeroInteiro) {
        this.numeroInteiro = numeroInteiro;
    }

    public int getNumeroInteiro() {
        return numeroInteiro;
    }

    public void setNumeroInteiro(int numeroInteiro) {
        this.numeroInteiro = numeroInteiro;
    }

    @Override
    public String toString() {
        return "Numero [numeroInteiro=" + numeroInteiro + "]";
    }

    
}
