import java.util.Scanner;

public  class EntradaDados {
    public  static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine(); // capita o valor inteiro da linha, só next pega soó a primeira palavra
        System.out.print("Nome: " + nome);


        System.out.print("Digite sua idade: ");
        String idade = sc.nextLine();
        System.out.print("Idade: " + idade);

        System.out.println("Digite seu peso :");
        String peso = sc.nextLine();
        System.out.print("Peso: " + peso);



    }
}