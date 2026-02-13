package pooc;

import java.util.Scanner;

public class MainCarro {

    public static void main(String[] args) {

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