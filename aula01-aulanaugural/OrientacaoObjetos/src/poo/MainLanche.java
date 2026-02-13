package poo;

public class MainLanche {
    public static void main(String[] args) {

        Lanche xegg = new Lanche();
        xegg.nome = "X-Egg";
        xegg.descricao = "Pão, Ovo, Maionese, Hamburguer, Queijo";
        xegg.tamanho = "Grande";
        xegg.preco = 29.90;

        xegg.exibirinfo();

        // criar um novo objeto lanche
        // qualquer lanche


        Lanche xbacon = new Lanche();
        xbacon.nome = "X-Bacon";
        xbacon.descricao = "Pão, Hamburguer, Bacon, Maionese";
        xbacon.tamanho = "Grande";
        xbacon.preco = 35.50;
        xbacon.exibirinfo();
    }
}
