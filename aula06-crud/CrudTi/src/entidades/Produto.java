package entidades;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //SETTERS PARA A ATUALIZAÇÃO DO PRODUTO
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double calcularValorEstoque() { return(this.quantidade * this.preco);

    }

    @Override
    public String toString() {
        return " | " + this.nome + " | " + this.preco + " | " + this.quantidade + " | " + this.calcularValorEstoque();
    }


}

