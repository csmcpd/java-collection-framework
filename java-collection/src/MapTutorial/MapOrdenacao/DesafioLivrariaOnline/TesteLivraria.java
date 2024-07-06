package MapTutorial.MapOrdenacao.DesafioLivrariaOnline;

public class TesteLivraria {
    public static void main(String[] args) {
        LivrariaOnline livraria = new LivrariaOnline();

        livraria.removerLivro("teste");

        livraria.adicionarLivro("https://a.co/d/0bakOOwj", "Ayrton: o Herói Revelado", "Ernesto Rodrigues ", 337.35d);
        livraria.adicionarLivro("https://a.co/d/0dn0ExWq", "Pai Rico, pai Pobre: Edição de 20 Anos", "Kiyosaki Robert T ", 128.17d);
        livraria.adicionarLivro("https://amzn.to/3OYb9jk", "Malorie", "Josh Malerman", 5d);
        livraria.adicionarLivro("https://amzn.to/45u86q4", "Assassinato no Expresso do Oriente", "Agatha Christie", 5d);
        livraria.adicionarLivro("Ernesto Rodrigues ", "Quem pensa enriquece:", " Napoleon Hill", 880.10d);

        System.out.println(livraria.exibirLivrosOrdenadosPorPreco());

        livraria.removerLivro("Malorie");

        System.out.println(livraria.exibirLivrosOrdenadosPorPreco());

        livraria.removerLivro("Pai Rico, pai Pobre: Edição de 20 Anos");

        System.out.println(livraria.exibirLivrosOrdenadosPorPreco());

        System.out.println("Livro mais caro da livraria: " + livraria.obterLivroMaisCaro());
        
        System.out.println("Livro mais barato da livraria: " + livraria.exibirLivroMaisBarato());
    }
}
