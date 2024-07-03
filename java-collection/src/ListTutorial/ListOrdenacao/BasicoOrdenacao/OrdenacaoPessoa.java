package ListTutorial.ListOrdenacao.BasicoOrdenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    List<Pessoa> pessoas;

    public OrdenacaoPessoa() {    
        this.pessoas = new ArrayList<>();
    }

    /*
     * Adiciona uma pessoa à lista.
     */
    public void adicionarPessoa(String nome, int idade, double altura) {      
        pessoas.add(new Pessoa(nome, idade, altura));   
    }

    /*
     * Ordena as pessoas da lista por idade usando a interface Comparable.
     */
    public List<Pessoa> ordenarPorIdade() {  
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade; 
    }

    /*
     * Ordena as pessoas da lista por altura usando 
     * um Comparator personalizado.
     */
    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoas);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }
    
}
