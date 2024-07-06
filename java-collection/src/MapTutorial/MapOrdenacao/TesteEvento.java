package MapTutorial.MapOrdenacao;

import java.time.LocalDate;
import java.time.Month;

public class TesteEvento {
    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();

        agenda.adicionarEvento(LocalDate.of(2024, Month.JULY, 30), "Evento 1", "Show busines");
        agenda.adicionarEvento(LocalDate.of(2024, 06, 30), "Evento 2", "Show busines");
        agenda.adicionarEvento(LocalDate.of(2024, 07, 03), "Evento 3", "Acampamento");
    
        agenda.exibirAgenda();

        agenda.obterProximoEvento();
    
    }
}
