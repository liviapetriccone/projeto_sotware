import entidades.Aluno;
import entidades.GerenciarListaAluno;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Joao", 10, 10);

        GerenciarListaAluno listaAlunos = new GerenciarListaAluno();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Lista de opções");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Atualizar aluno");
            System.out.println("4 - Excluir aluno");
            System.out.println("5 - Sair do programa");
            System.out.print("Digite a opção desejada: ");
            String opcao = sc.nextLine();

            switch (opcao) {
                case "1" -> {
                    System.out.print("Digite o nome do aluno: ");
                    String nome = sc.nextLine();

                    System.out.print("Digite a primeira nota: ");
                    double nota = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Digite a segunda nota: ");
                    double nota2 = sc.nextDouble();
                    sc.nextLine();

                    Aluno alunos = new Aluno(nome, nota, nota2);
                    listaAlunos.cadastrarAluno(aluno);


                }

                case "2" -> {
                    listaAlunos.listarAlunos();
                }

                case "3" -> {
                    listaAlunos.listarAlunos();
                    System.out.println("Informe o ID do aluno: ");
                    int idAluno = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Informe o novo nome do aluno: ");
                    String nomeAluno = sc.nextLine();

                    System.out.println("Informe a nova nota 1: ");
                    double notaAluno = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Informe a nova nota 2: ");
                    double notaAluno2 = sc.nextDouble();
                    sc.nextLine();


                    listaAlunos.atualizarAluno(idAluno, nomeAluno, notaAluno, notaAluno2);
                }

                case"4" ->  {
                    listaAlunos.listarAlunos();
                    System.out.println("Informe o ID do aluno: ");
                    int idAluno = sc.nextInt();
                    sc.nextLine();

                    listaAlunos.removerAlunos(idAluno);
                }

                case"5" -> {
                    System.out.println("Programa finalizado com sucesso!");
                    return;
                }
            }

        }



    }
}
