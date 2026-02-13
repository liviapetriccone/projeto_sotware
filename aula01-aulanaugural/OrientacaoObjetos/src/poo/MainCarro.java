package poo;

import java.util.Scanner;

public class MainCarro {

    public static void main(String[] args) {

        Carro civic = new Carro();
        civic.modelo = "Civic";
        civic.marca = "Honda";
        civic.ano  = "2026";
        civic.exibirinfo();

        Carro gol = new Carro();
        gol.modelo = "Gol";
        gol.marca = "Wolkswagen";
        gol.ano  = "2010";
        gol.exibirinfo();



        // jeito do professor

        Scanner sc = new Scanner(System.in);
        Carro carro = new Carro();

        System.out.println("Digite o modelo do carro: ");
        carro.modelo = sc.nextLine();
        System.out.println("Digite a marca do carro: ");
        carro.marca = sc.nextLine();
        System.out.println("Digite o ano do carro: ");
        carro.ano = sc.nextLine();
    }
}
