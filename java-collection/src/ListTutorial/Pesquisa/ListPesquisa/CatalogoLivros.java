package ListTutorial.Pesquisa.ListPesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    /*
     *  Adiciona um livro ao catálogo.
     */
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    /*
     * Pesquisa livros por autor e retorna uma lista com os livros encontrados.
     */
    public List<Livro> pesquisarPorAutor(String autor) {

        List<Livro> livrosPorAutor = new ArrayList<>();

        if (livroList.isEmpty() == false) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        } else {
            System.out.println("Lista esta vazia");
        }

        return livrosPorAutor;
    }

    /*
     * Pesquisa livros publicados em um determinado intervalo 
     * de anos e retorna uma lista com os livros encontrados.
     */
    public List<Livro> pesquisarPorIntervalosAno(int anoInicial, int anoFinal) {

        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();

        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        } else {
            System.out.println("Lista esta vazia");
        }

        return livrosPorIntervaloAnos;
    }

    /*
     * Pesquisa livros por título e retorna o primeiro livro encontrado.
     */
    public Livro pesquisarPorTitulo(String titulo) {

        Livro livroPorTitulo = null;
        if (livroList.isEmpty() == false) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        } else {
            System.out.println("Lista esta vazia");
        }

        return livroPorTitulo;
    }

}
