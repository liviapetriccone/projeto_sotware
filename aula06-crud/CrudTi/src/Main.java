import entidades.Produto;

import entidades.GerenciarProdutos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        GerenciarProdutos listarProdutos = new GerenciarProdutos();

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Lista de opções");
            System.out.println("1- Cadastrar Produto");
            System.out.println("2- Listar Produto");
            System.out.println("3- Atualizar Produto");
            System.out.println("4- Remover Produto");
            System.out.println("5- Sair");
            System.out.print("Digite a opção desejada: ");
            String opcao = sc.nextLine();


            switch (opcao) {
                case"1" -> {
                    System.out.println("Digite o nome do produto: ");
                    String nome = sc.nextLine();

                    System.out.println("Digite o preço do produto: ");
                    double preco = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Digite o quantidade do produto: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    Produto  produto= new Produto(nome, preco, quantidade);
                    listarProdutos.cadastrarProdutos(produto);
                }

                case "2" -> {
                    listarProdutos.listarProdutos();
                }

                case "3" -> {
                    listarProdutos.listarProdutos();
                    System.out.println("Informe o ID do produto: ");
                    int idProduto = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Informe o novo nome do produto: ");
                    String nomeProduto = sc.nextLine();

                    System.out.println("Informe o novo preço do produto: ");
                    double precoProduto = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Informe a nova quantidade do produto: ");
                    int quantidadeProduto = sc.nextInt();
                    sc.nextLine();


                    listarProdutos.atualizarProduto(idProduto, nomeProduto, precoProduto, quantidadeProduto );
                }

                case"4" ->  {
                    listarProdutos.listarProdutos();
                    System.out.println("Informe o ID do aluno: ");
                    int idProduto = sc.nextInt();
                    sc.nextLine();

                    listarProdutos.excluirProduto(idProduto);
                }

                case"5" -> {
                    System.out.println("Programa finalizado com sucesso!");
                    return;
                }
            }
        }
    }
}