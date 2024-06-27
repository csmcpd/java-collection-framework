package SetTutorial.SetOperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;
    
    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<Convidado>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
      convidadoSet.add(new Convidado(nome, codigoConvite));  
    }
    
    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado codigoParaRemover = null;

        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                codigoParaRemover = c;
                break;
            } else {
                System.out.println("Código de convite não existe");
            }
        }
        convidadoSet.remove(codigoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }
}
