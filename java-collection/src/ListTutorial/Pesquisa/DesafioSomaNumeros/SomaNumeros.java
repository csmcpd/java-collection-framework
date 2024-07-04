package ListTutorial.Pesquisa.DesafioSomaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Numero> numeroList;

    public SomaNumeros() {
        this.numeroList = new ArrayList<>();
    }

    /*
     * Adiciona um número à lista de números.
     */
    public void adicionarNumero(int numero) {
        numeroList.add(new Numero(numero));
    }

    /*
     * Calcula a soma de todos os números na 
     * lista e retorna o resultado.
     */
    public int calcularSoma() {
        int numeroSomaTotal = 0;

        for (Numero numero : numeroList) {
            numeroSomaTotal += numero.getNumeroInteiro(); 
        }

        return numeroSomaTotal;
    }

    /*
     * Encontra o maior número na lista e retorna o valor.
     */
    public int encontrarMaiorNumero() {
        int numeroMaior = 0;

        for (Numero numero : numeroList) {
            if (numeroMaior <= numero.getNumeroInteiro()) {
                numeroMaior = numero.getNumeroInteiro();
            }
        }

        return numeroMaior;
    }
    
    /*
     * Encontra o menor número na lista e retorna o valor.
     */
    public int encontrarMenorNumero() {
        int numeroMenor = this.calcularSoma();

        for (Numero numero : numeroList) {
            if (numeroMenor >= numero.getNumeroInteiro()) {
                numeroMenor = numero.getNumeroInteiro();
            }
        }

        return numeroMenor;
    }

    /*
     * Retorna uma lista contendo todos os números presentes na lista.
     */
    public List<Numero> exibirNumeros() {
        return numeroList;
    }
}
