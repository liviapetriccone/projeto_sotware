package poo;

public class Lanche {

    String nome;
    String descricao;
    String tamanho;
    double preco;

    // criar metodo para a exibião do lanche
    public void exibirinfo(){
        System.out.println("Lanche: " + nome+
                "\nDescrição: " + descricao +
                "\nTamanho: " + tamanho +
                "\npreco: R$ " + preco + "\n");
    }

}
