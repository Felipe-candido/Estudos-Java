import domain.Aluno;
import domain.Curso;
import domain.Departamento;
import domain.Professor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<String> conhecimentosDSM = new ArrayList<>();

        conhecimentosDSM.add("Programação Orientada a Objetos");
        conhecimentosDSM.add("CI/CD");
        conhecimentosDSM.add("NoSQL");


        List<String> conhecimentosGE = new ArrayList<>();

        conhecimentosGE.add("Design Sprint");
        conhecimentosGE.add("Logistica");
        conhecimentosGE.add("Moral e Etica");


        Curso dsm = new Curso()
                .setNome("Desenvolvimento Multiplataforma")
                .setConhecimento(conhecimentosDSM);


        Curso ge = new Curso()
                .setNome("Gestão Empresarial")
                .setConhecimento(conhecimentosGE);

        Departamento dsi = new Departamento()
                .setNome("Departamento de Sistemas de Informação");

        Departamento dge = new Departamento()
                .setNome("Departamento de Gestão Empresarial");

        Professor p1 = new Professor(
                Arrays.asList(new Aluno("Gustavo B Silva"),
                        new Aluno("Ana Maria C Silva"))
        );

        Professor p2 =  new Professor(
                Arrays.asList(new Aluno("Mariana"), new Aluno("Pedro"))
        );

        dsi.adicionarProfessor(p1);
        dge.adicionarProfessor(p2);
        p1.ensina(ge);
        p1.ensina(dsm);
    }
}