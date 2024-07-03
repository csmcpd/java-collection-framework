package MapTutorial.MapOperacoesBasicas.MapOperacoesBasicasDesafioDicionario;

public class TesteDicionario {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("palavra 1", "definição 1");
        dicionario.adicionarPalavra("palavra 2", "definição 4");
        dicionario.adicionarPalavra("palavra 3", "definição 3");
        dicionario.adicionarPalavra("palavra 10", "definição 7");

        dicionario.exibirPalavras();

        System.out.println("Palavra pesquisada: " + dicionario.pesquisarPorPalavra("palavra 3"));
        
        dicionario.removerPalavra("palavra 2");   

        dicionario.exibirPalavras();
    }
}
