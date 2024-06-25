package ListTutorial.OperacoesBasicasList.OperacoesBasicasListDesafioCarrinhoCompras;

public class Compras {

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("tomate", 5.06, 5);
        carrinho.adicionarItem("cebola", 9.09, 5);
        carrinho.adicionarItem("tomate", 5.06, 5);
        carrinho.exibirItens();
        carrinho.calcularValorTotal();

        carrinho.removerItem("TOMATE");
        carrinho.exibirItens();
        carrinho.calcularValorTotal();
    }
}
