import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Venda {
    private List<Produto> cadastro = new ArrayList<Produto>();

    public List<Produto> getCadastro() {
        return cadastro;
    }

    public void setCadastro(List<Produto> cadastro) {
        this.cadastro = cadastro;
    }

    public void cadastroProduto(Produto produto) {
        if (cadastro.contains(produto)) { // Verifica se um elemento já existe na lista
            System.out.println("Produto já existe na lista");
        } else {
            this.cadastro.add(produto);
            System.out.println("Você acabou de cadastrar um produto");
        }

    }

    public void listarProdutos() {
        for (int i = 0; i < cadastro.size(); i++) {
            System.out.println("id: " + (i + 1) + " " + cadastro.get(i));
        }
        System.out.println("Total de produtos:" + cadastro.size());
    }

    public void venderProduto() {
        Scanner sc = new Scanner(System.in);
        int resposta = 1;
        while (resposta == 1) {
            this.listarProdutos();
            System.out.println("Digite o id do produto que deseja comprar");
            int id = sc.nextInt();
            id = id - 1; // Deixa o id igual o indice da lista

            try {
                if (cadastro.contains(cadastro.get(id))) {
                    System.out.println("Produto encontrado! Próxima etapa é o pagamento");
                    System.out.println("O produto e o seu preço selecionado são: " + cadastro.get(id));
                    cadastro.remove(id); // Remove o item selecionado
                }
            } catch (IndexOutOfBoundsException erro1) {
                System.out.println("Id inválido");
            }
            try {
                System.out.println("Deseja continuar? 1 para sim e 0 para não");
                resposta = sc.nextInt();
            }
            catch (Exception erro2) {
                System.out.println("Opção inválida! Tente novamente");
            }


        }


    }
}







