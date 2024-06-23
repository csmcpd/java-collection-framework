package ListPesquisa;

public class Biblioteca {

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro("Titulo legal", "Eu mesmo", 1981);
        catalogo.adicionarLivro("Titulo legal", "Eu mesmo", 1995);
        catalogo.adicionarLivro("enois", "Eu", 1999);
        catalogo.adicionarLivro("enois", "Eu", 2005);
        catalogo.adicionarLivro("belezal", "eles", 2015);

        //System.out.println(catalogo.pesquisarPorAutor("eu"));
        //System.out.println(catalogo.pesquisarPorIntervalosAno(1995, 2000));
        System.out.println(catalogo.pesquisarPorTitulo("enois"));
    }
}
