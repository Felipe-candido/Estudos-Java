package domain;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;

    public String getNome(){
        return nome;
    }

    public Curso setNome(String nome) {
        this.nome = nome;
        return this;
    }

    private List<String> conhecimentos = new ArrayList<>();

    public List<String> getConhecimentos() {
        return conhecimentos;
    }

    public Curso setConhecimento(List<String> conhecimentos){

       this.conhecimentos = conhecimentos;
        return this;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", conhecimentos=" + conhecimentos +
                '}';
    }
}

