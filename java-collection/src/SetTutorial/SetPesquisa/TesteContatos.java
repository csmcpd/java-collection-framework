package SetTutorial.SetPesquisa;

public class TesteContatos {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("crist santos", 911112222);
        agendaContatos.adicionarContato("seu lunga", 933332222);
        agendaContatos.adicionarContato("Geraldo", 98672222);
        agendaContatos.adicionarContato("Geraldo", 98671111);
        agendaContatos.adicionarContato("Legal dos Legais", 911112222);
        agendaContatos.adicionarContato("Legal dos Santos", 977778888);
        agendaContatos.adicionarContato("crist santos", 986756453);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Legal"));
       
        System.out.println("Telefone alterado: " +agendaContatos.atualizarNumeroContato("seu lunga", 900005555));
    
        agendaContatos.exibirContatos();
    }
}
