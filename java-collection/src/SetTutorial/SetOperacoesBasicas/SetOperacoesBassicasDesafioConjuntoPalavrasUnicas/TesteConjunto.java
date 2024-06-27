package SetTutorial.SetOperacoesBasicas.SetOperacoesBassicasDesafioConjuntoPalavrasUnicas;

public class TesteConjunto {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjPalUni = new ConjuntoPalavrasUnicas();

        conjPalUni.adicionarPalavra("palavra 1");
        conjPalUni.adicionarPalavra("palavra 1");
        conjPalUni.adicionarPalavra("palavra 2");
        conjPalUni.adicionarPalavra("palavra 4");
        conjPalUni.adicionarPalavra("palavra 3");
        conjPalUni.adicionarPalavra("palavra 4");
        conjPalUni.adicionarPalavra("palavra 5");

        conjPalUni.exibirPalavrasUnicas();

        conjPalUni.verificarPalavra("palavra 2");
    }
}
