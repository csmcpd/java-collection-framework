package ListTutorial.Ordenacao.DesafioOrdenacaoNumeros;

public class TesteInteiro {
    
    public static void main(String[] args) {
        OrdenacaoNumeros ordNumeros = new OrdenacaoNumeros();

        ordNumeros.adicionarNumero(12);
        ordNumeros.adicionarNumero(3);
        ordNumeros.adicionarNumero(1);
        ordNumeros.adicionarNumero(56);
        ordNumeros.adicionarNumero(44);
        ordNumeros.adicionarNumero(150);
        ordNumeros.adicionarNumero(23);

        System.out.println(ordNumeros.ordenarAscendente());

        System.out.println(ordNumeros.ordenarDescendente());
    }

}
