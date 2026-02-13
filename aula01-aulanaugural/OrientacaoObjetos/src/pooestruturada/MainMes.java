package pooestruturada;

public class MainMes {
    public static void main(String[] args) {

        Mes janeiro = new Mes();
        Mes feveiro = new Mes();

        janeiro.agua= 200;
        janeiro.energia = 80.90;
        janeiro.alimentacao = 369.89;
        janeiro.gastototal();

        feveiro.agua = 200;
        feveiro.energia = 80.90;
        feveiro.alimentacao = 369.89;
        feveiro.gastototal();
    }
}
