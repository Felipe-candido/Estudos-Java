import domain.Aluno;
import domain.Curso;
import domain.Professor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> conhecimentos = new ArrayList<>();
        conhecimentos.add("Programação Orientada a Objetos");
        conhecimentos.add("CI/CD");
        conhecimentos.add("NoSQL");


        Curso dsm = new Curso()
                .setNome("Desenvolvimento ultiplataforma")
                .setConhecimento(conhecimentos);

        System.out.println(dsm);

        Professor p1 = new Professor(
                Arrays.asList(new Aluno("Gustavo B Silva"),
                        new Aluno("Ana Maria C Silva"))
        );
        p1.ensina(dsm);
    }
}