package SetTutorial.SetOperacoesBasicas;

public class TestaConvidado {
    public static void main(String[] args) {
        ConjuntoConvidados conjCovi = new ConjuntoConvidados();
        System.out.println("Existem " + conjCovi.contarConvidados() 
        + " convidados dentro do set de convidados");

        conjCovi.adicionarConvidado("Convidado 44", 1);
        conjCovi.adicionarConvidado("Convidado 31", 2);
        conjCovi.adicionarConvidado("Convidado 90", 1);
        conjCovi.adicionarConvidado("Convidado 65", 4);
        conjCovi.adicionarConvidado("Convidado 5", 3);

        System.out.println("Existem " + conjCovi.contarConvidados() 
        + " convidados dentro do set de convidados");

        //conjCovi.removerConvidadoPorCodigoConvite(2);
        conjCovi.exibirConvidados();
    }
}
