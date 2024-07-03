package MapTutorial.MapOrdenacao.AgendaEventos;

public class Evento {

    private String Evento;
    private String Atracao;
    
    public Evento(String nomeEvento, String nomeAtracao) {
        this.Evento = nomeEvento;
        this.Atracao = nomeAtracao;
    }

    public String getEvento() {
        return Evento;
    }

    public void setEvento(String nomeEvento) {
        this.Evento = nomeEvento;
    }

    public String getAtracao() {
        return Atracao;
    }

    public void setAtracao(String nomeAtracao) {
        this.Atracao = nomeAtracao;
    }

    @Override
    public String toString() {
        return "Evento: " 
        + Evento + ", Atracao: " + Atracao + "\n";
    } 

    
    
}
