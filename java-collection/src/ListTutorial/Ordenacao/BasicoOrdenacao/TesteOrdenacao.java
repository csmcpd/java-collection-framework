package ListTutorial.ListOrdenacao.BasicoOrdenacao;

public class TesteOrdenacao {

    public static void main(String[] args) {
        OrdenacaoPessoa ordenar = new OrdenacaoPessoa();
        ordenar.adicionarPessoa("nome 1", 43, 1.83);
        ordenar.adicionarPessoa("nome 2", 54, 1.77);
        ordenar.adicionarPessoa("nome 5", 33, 1.67);
        ordenar.adicionarPessoa("nome 4", 43, 1.56);
        ordenar.adicionarPessoa("nome 3", 12, 1.22);

        System.out.println(ordenar.pessoas);

        //System.out.println(ordenar.ordenarPorAltura());
        System.out.println(ordenar.ordenarPorIdade());
    }

}
