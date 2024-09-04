package domain;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private List<String> conhecimentos = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public Aluno setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Aluno(String nome){
        this.nome = nome;
    }


    public void assimila(List<String> conhecimentos) {
        this.conhecimentos = conhecimentos;
        System.out.println(nome + ", assimilou...");
        this.conhecimentos.forEach(System.out::println);
    }
}
