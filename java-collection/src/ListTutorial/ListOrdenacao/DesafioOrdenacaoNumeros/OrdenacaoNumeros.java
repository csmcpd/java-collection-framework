package ListTutorial.ListOrdenacao.DesafioOrdenacaoNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Inteiros> numeroList;

    public OrdenacaoNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeroList.add(new Inteiros(numero));
    }

    public List<Inteiros> ordenarAscendente() {
        List<Inteiros> numeroAscedente = new ArrayList<>(numeroList);
        Collections.sort(numeroAscedente);
        return numeroAscedente;
    }

    public List<Inteiros> ordenarDescendente() {
        List<Inteiros> numeroDescedente = new ArrayList<>(numeroList);
        Collections.sort(numeroDescedente);
        Collections.reverse(numeroDescedente);
        return numeroDescedente;
    }
}
