package MapTutorial.MapPesquisas.MapPesquisasDesafioContagemDePalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> palavraMap;

    public ContagemPalavras() {
        this.palavraMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        palavraMap.put(palavra, contagem);
    }

    
}
