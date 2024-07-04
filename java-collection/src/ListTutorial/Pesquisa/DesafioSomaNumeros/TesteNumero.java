package ListTutorial.Pesquisa.DesafioSomaNumeros;

public class TesteNumero {

    public static void main(String[] args) {
        SomaNumeros numeroTeste = new SomaNumeros();

        numeroTeste.adicionarNumero(4);
        numeroTeste.adicionarNumero(22);
        numeroTeste.adicionarNumero(11);
        numeroTeste.adicionarNumero(14);
        numeroTeste.adicionarNumero(36);

        System.out.println(numeroTeste.calcularSoma());

        System.out.println(numeroTeste.encontrarMaiorNumero());

        System.out.println(numeroTeste.encontrarMenorNumero());

        System.out.println(numeroTeste.exibirNumeros());
    }

}
