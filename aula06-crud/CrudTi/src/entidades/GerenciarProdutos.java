package entidades;

import java.util.ArrayList;

public class GerenciarProdutos {
    ArrayList<Produto> produtos = new ArrayList<>();

    public void cadastrarProdutos(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto cadastrado com sucesso!");

    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado com sucesso!");
        } else {
            System.out.println("ID | NOME | PREÇO | QUANTIDADE | VALOR EM ESTOQUE");
            for (Produto produto : produtos) {
                System.out.println(" | " + produtos.indexOf(produto) + " | " + produto + " | " );
            }
        }
    }


    public void atualizarProduto(int idProduto, String nomeProduto, double precoProduto, int quantidadeProduto) {

        Produto produto = produtos.get(idProduto);
        produto.setNome(nomeProduto);
        produto.setPreco(precoProduto);
        produto.setQuantidade(quantidadeProduto);
        System.out.println("Produto atualizado com sucesso!");
    }

    public void excluirProduto(int idProduto) {
        produtos.remove(idProduto);
        System.out.println("Produto excluido com sucesso!");
    }

    public void excluirProdutos(int idProduto) {
    }



}


