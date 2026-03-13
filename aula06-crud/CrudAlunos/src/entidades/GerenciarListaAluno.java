package entidades;

import java.util.ArrayList;

public class GerenciarListaAluno {
    ArrayList<Aluno> alunos = new ArrayList<>();

    public void cadastrarAluno(Aluno aluno){
    alunos.add(aluno);
        System.out.println("Aluno cadastrado com sucesso!");
    }

    public void listarAlunos(){
        if(alunos.isEmpty()){
            System.out.println("Nenhum aluno encontrado!");
        } else{
            System.out.println(" | ID | NOME | NOTA 1 | NOTA 2 | MEDIA | SITUAÇÃO |");
            for (Aluno aluno : alunos) {
                System.out.println(" | " + alunos.indexOf(aluno) + " | " + aluno);
            }
        }
    }

    public void atualizarAluno(int idAluno, String nomeAluno, double notaAluno, double notaAluno2){

        Aluno aluno = alunos.get(idAluno);
        aluno.setNome(nomeAluno);
        aluno.setNota(notaAluno);
        aluno.setNota2(notaAluno2);
        System.out.println("Cadastro do aluno atualizado com sucesso!");
    }

    public void removerAluno(int idAluno){
        alunos.remove(idAluno);
        System.out.println("Aluno removido com sucesso!");
    }
}
