package MapTutorial.MapPesquisas.DesafioContagemDePalavras;

public class TestePalavras {
    public static void main(String[] args) {
        ContagemPalavras palavra = new ContagemPalavras();

        palavra.adicionarPalavra("Palavra 1", 5);
        palavra.adicionarPalavra("Palavra 2", 7);
        palavra.adicionarPalavra("Palavra 3", 2);
        palavra.adicionarPalavra("Palavra 4", 1);

        palavra.exibirContagemPalavras();

        palavra.removerPalavra("Palavra 12");

        palavra.exibirContagemPalavras();

        System.out.println("Palavra mais frequente" + palavra.encontrarPalavraMaisFrequente());
        
    }
}
