package ListTutorial.OperacoesPesquiaList.OperacoesPesquisaListDesafioSomaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Numero> numeroList;

    public SomaNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeroList.add(new Numero(numero));
    }

    public int calcularSoma() {
        int numeroSomaTotal = 0;

        for (Numero numero : numeroList) {
            numeroSomaTotal += numero.getNumeroInteiro(); 
        }

        return numeroSomaTotal;
    }

    public int encontrarMaiorNumero() {
        int numeroMaior = 0;

        for (Numero numero : numeroList) {
            if (numeroMaior < numero.getNumeroInteiro()) {
                numeroMaior = numero.getNumeroInteiro();
            }
        }

        return numeroMaior;
    }
    
    public int encontrarMenorNumero() {
        int numeroMenor = this.calcularSoma();

        for (Numero numero : numeroList) {
            if (numeroMenor > numero.getNumeroInteiro()) {
                numeroMenor = numero.getNumeroInteiro();
            }
        }

        return numeroMenor;
    }

    public List<Numero> exibirNumeros() {
        return numeroList;
    }
}
