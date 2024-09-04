package domain;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private List<Aluno> alunos = new ArrayList<>();

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public Professor(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void ensina(Curso curso){
        System.out.println("Professor ensina.");
        System.out.println("Curso: " + curso.getNome());
//        curso.getConhecimentos().forEach(System.out::println);
        alunos.forEach(a -> a.assimila(curso.getConhecimentos()));
    }


}
