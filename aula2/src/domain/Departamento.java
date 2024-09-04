package domain;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nome;
    private List<Professor> professores = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public Departamento setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public Departamento setProfessores(List<Professor> professores) {
        this.professores = professores;
        return this;
    }

    public void adicionarProfessor(Professor professor){
        this.professores.add(professor);
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nome='" + nome + '\'' +
                ", professores=" + professores +
                '}';
    }
}
