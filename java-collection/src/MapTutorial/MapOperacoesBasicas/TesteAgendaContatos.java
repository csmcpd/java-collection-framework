package MapTutorial.MapOperacoesBasicas;

public class TesteAgendaContatos {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Cris", 12121212);
        agendaContatos.adicionarContato("Bacana", 222222);
        agendaContatos.adicionarContato("Legal", 3333333);
        agendaContatos.adicionarContato("Cris", 444444444);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Legal"));
        
        agendaContatos.removerContato("Bacana");

        agendaContatos.removerContato("Cris");

        agendaContatos.exibirContato();
        
    }
}
