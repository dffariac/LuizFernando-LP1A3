public class Main {
    public static void main(String[] args) {

        Produto a = new Produto("Colher", 1);
        Produto b = new Produto("Garrafa", 10 );
        Produto c = new Produto("Camiseta", 20);

        Venda venda = new Venda();

        venda.cadastroProduto(a);
        venda.cadastroProduto(b);
        venda.cadastroProduto(c);
        venda.cadastroProduto(a);
        venda.venderProduto();







    }
}