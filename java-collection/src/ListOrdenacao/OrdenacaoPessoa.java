package ListOrdenacao;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoPessoa {

    private List<Pessoa> pessoas;

    public OrdenacaoPessoa() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoas.add(new Pessoa(nome, idade, altura));
    }

    public void ordenarPorIdade() {
        pessoas.
    }

    public void ordenarPorAltura() {
        pessoas.
    }
    
}
