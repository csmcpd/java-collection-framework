package ListTutorial.Ordenacao.DesafioOrdenacaoNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Inteiros> numeroList;

    public OrdenacaoNumeros() {
        this.numeroList = new ArrayList<>();
    }

    /*
     * Adiciona um número à lista.
     */
    public void adicionarNumero(int numero) {
        numeroList.add(new Inteiros(numero));
    }

    /*
     * Ordena os números da lista em ordem ascendente 
     * usando a interface Comparable e a class Collections.
     */
    public List<Inteiros> ordenarAscendente() {
        List<Inteiros> numeroAscedente = new ArrayList<>(this.numeroList);
        Collections.sort(numeroAscedente);
        return numeroAscedente;
    }

    /*
     * Ordena os números da lista em ordem descendente 
     * usando um Comparable e a class Collections.
     */
    public List<Inteiros> ordenarDescendente() {
        List<Inteiros> numeroDescedente = new ArrayList<>(numeroList);
        Collections.sort(numeroDescedente);
        Collections.reverse(numeroDescedente);
        return numeroDescedente;
    }
}
