package domain;

import java.util.ArrayList;
import java.util.List;

public class Universidade {
    private List<Departamento> departamentos = new ArrayList<>();

    public void criarDepartamento(Departamento departamento){
        this.departamentos.add(departamento);
    }

    public void encerrarDepartamento(Departamento departamento){
        this.departamentos.remove(departamento);
    }

    public void listarDepartamentos(){
        this.departamentos.forEach(System.out::println);
    }
}
