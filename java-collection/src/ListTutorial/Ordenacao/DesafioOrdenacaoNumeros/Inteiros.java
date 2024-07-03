package ListTutorial.ListOrdenacao.DesafioOrdenacaoNumeros;

public class Inteiros implements Comparable<Inteiros>{

    private int numeroInteiro;

    public Inteiros(int numeroInteiro) {
        this.numeroInteiro = numeroInteiro;
    }

    @Override
    public int compareTo(Inteiros i) {
        return Integer.compare(numeroInteiro, i.getNumeroInteiro());
    }

    public int getNumeroInteiro() {
        return numeroInteiro;
    }

    public void setNumeroInteiro(int numeroInteiro) {
        this.numeroInteiro = numeroInteiro;
    }

    @Override
    public String toString() {
        return "Inteiros [numeroInteiro=" + numeroInteiro + "]";
    }
   
}
