package MapTutorial.MapOrdenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    /*
     * Adiciona um evento à agenda.
     */
    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventoMap.put(data, new Evento(nome, atracao));
    }

    /*
     * Exibe a agenda de eventos em ordem crescente de data.
     */
    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreemap = new TreeMap<>(eventoMap);

        for (Map.Entry<LocalDate, Evento> entry : eventosTreemap.entrySet()) {
            System.out.println("Data " + entry.getKey() + " teremos " + entry.getValue());
        }
    }

    /*
     * Retorna o próximo evento que ocorrerá.
     */
    public void obterProximoEvento() {
        Map<LocalDate, Evento> eventosTreemap = new TreeMap<>(eventoMap);

        LocalDate dataAtual = LocalDate.now();

        for (Map.Entry<LocalDate, Evento> entry : eventosTreemap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println("O próximo " + entry.getValue() 
                + " acontecerá na data " + entry.getKey());

                break;
            }
        }

        /*
         * Poderia ser assim:
         * 
         */

         /*
          *  for (var entry : eventosTreemap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println("O próximo " + entry.getValue() 
                + " acontecerá na data " + entry.getKey());

                break;
            }
        }
          */
        
    }
    
}
