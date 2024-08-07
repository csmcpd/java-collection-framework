package ListTutorial.OperacoesBasicas.DesafioCarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

/*
 * A interface List é uma coleção ordenada que permite 
 * a inclusão de elementos duplicados.É um dos tipos de 
 * coleção mais utilizados em Java, e as classes de 
 * implementação comuns são ArrayList e LinkedList.
 * 
 * A List se assemelha a uma matriz com comprimento dinâmico, 
 * permitindo adicionar ou remover elementos.
 * 
 * A interface List fornece métodos úteis para adicionar elementos 
 * em posições específicas, remover ou substituir elementos 
 * com base no índice e obter sublistas usando índices.
 * 
 * A classe Collections fornece algoritmos úteis para manipulação de List, 
 * como ordenação (sort), embaralhamento (shuffle), reversão (reverse) 
 * e busca binária (binarySearch).
 * 
 * ArrayList: O ArrayList é uma implementação da interface List que 
 * armazena os elementos em uma estrutura de array redimensionável. 
 * Isso significa que ele pode crescer automaticamente à medida 
 * que novos elementos são adicionados. A principal vantagem do 
 * ArrayList é o acesso rápido aos elementos por meio de índices, 
 * o que permite recuperar um elemento específico de forma eficiente. 
 * No entanto, adicionar ou remover elementos no meio da lista pode 
 * ser mais lento, pois requer a realocação de elementos.
 * 
 * LinkedList: O LinkedList é uma implementação da interface List 
 * que armazena os elementos em uma lista duplamente vinculada. 
 * Cada elemento contém referências para o elemento anterior e 
 * próximo na lista. A principal vantagem do LinkedList é a 
 * eficiência na adição ou remoção de elementos no início 
 * ou no final da lista, pois não é necessário realocar elementos. 
 * No entanto, o acesso aos elementos por meio de índices 
 * é mais lento, pois requer percorrer a lista até o elemento desejado.
 * 
 * Vector: O Vector é uma implementação antiga da interface List 
 * que é semelhante ao ArrayList, mas é sincronizada, 
 * ou seja, é thread-safe. Isso significa que várias 
 * threads podem manipular um objeto Vector ao mesmo 
 * tempo sem causar problemas de concorrência. 
 * No entanto, essa sincronização adiciona uma 
 * sobrecarga de desempenho, tornando o Vector 
 * menos eficiente do que o ArrayList em cenários 
 * em que a concorrência não é um problema. 
 * Por esse motivo, o uso do Vector é menos comum em aplicações modernas.
 */

/*
 * Desafio:
 * 
 * Crie uma classe chamada "CarrinhoDeCompras" 
 * que representa um carrinho de compras online. 
 * O carrinho deve ser implementado como uma 
 * lista de itens. Cada item é representado 
 * por uma classe chamada "Item" que possui 
 * atributos como nome, preço e quantidade. I
 * mplemente os seguintes métodos:
 */

 public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    /*
     *  Adiciona um item ao carrinho com o nome, preço e quantidade especificados.
     */
    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    /*
     * Remove um item do carrinho com base no seu nome.
     */
    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();

        for (Item i : itemList) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(i);
            }     
        } 

        itemList.removeAll(itensParaRemover);
    }

    /*
     * Calcula e retorna o valor total do carrinho, levando em consideração o 
     * preço e a quantidade de cada item.
     */
    public void calcularValorTotal() {
        double total = 0.0;
        for (Item item : itemList) {
            total += item.getPreco() * item.getQuantidade();
        }
        System.out.println(total);
    }

    /*
     * Exibe todos os itens presentes no carrinho, 
     * mostrando seus nomes, preços e quantidades.
     */
    public void exibirItens() {
        if (!itemList.isEmpty()) {
            itemList.forEach(System.out::print);
        } else {
            System.out.println("A lista está vazia!");
            throw new RuntimeException("A lista está vazia!");          
          }
        
    }
}
