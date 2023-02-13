package Menus;



import Produtos.ProdutoAbstrato;

import java.util.*;

public class MenuClienteClasseConcreta extends MenuClienteAbstract {

    public MenuClienteClasseConcreta(Scanner sc, List<ProdutoAbstrato> listaProdutos, List<ProdutoAbstrato> listaProdutosCarrinho) {
        super(sc, listaProdutos, listaProdutosCarrinho);
    }
    public void menuCliente() {
        int opcaoMenuCliente;
        do {
            System.out.println("-------Menu Cliente ------: ");
            System.out.println("1 - Visualizar lista de produtos");
            System.out.println("2 - Filtrar por categoria");
            System.out.println("3 - Filtrar por marca");
            System.out.println("4 - Ordenar por nome(ordem crescente e descrescente)");
            System.out.println("5 - Ordenar por preço(ordem crescente e descrescente)");
            System.out.println("6 - Adicionar Produto ao Carrinho");
            System.out.println("7 - Visualizar lista de Produtos no Carrinho");// adicionar o pagamento
            System.out.println("8 - Pagamento");
            System.out.println("0 - Sair do Menu Cliente");
            System.out.println("Entre com a opção desejada: ");
            opcaoMenuCliente = sc.nextInt();
            switch (opcaoMenuCliente) {
                case 0:
                    System.out.println("Saindo do Menu Cliente");
                    break;
                case 1:
                    visualizarProdutos();
                    break;
                case 2:
                    filtrarPorCategoria();
                    break;
                case 3:
                    filtrarPorMarca();
                    break;
                case 4:
                    ordenarPorNome();
                    break;
                case 5:
                    ordenarPorPreco();
                    break;
                case 6:
                    selecionarProdutoParaCarrinho();
                    break;
                case 7:
                    verListaProdutosCarrinho();
                    precoCarrinhoParaPgto();
                     break;
                case 8:
                    pagamento();
                    break;
            }
        } while (opcaoMenuCliente != 0);
    }

}
