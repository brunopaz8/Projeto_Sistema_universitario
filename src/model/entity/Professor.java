package model.entity;

import java.util.ArrayList;
import java.util.List;

import model.Pessoa;

public class Professor extends Pessoa{
    private int siape;
    private List<String> disciplinas = new ArrayList<>();

    @Override
    public void exibirDados(){   
        System.out.println("=========================");
        System.out.println("Informações do Professor:");
        System.out.printf("Nome: %s \n", getNome());
        System.out.printf("Cpf: %d \n", getCpf());
        System.out.printf("Idade: %d \n", getIdade());
        System.out.printf("Siape: %d \n", siape);
        System.out.printf("Disciplina/s: %s \n", String.join(", ", disciplinas));
        System.out.println("=========================");
    }

    public int getSiape() {
        return siape;
    }

    public void setSiape(int siape) {
        this.siape = siape;
    }

    public List<String> getDisciplinas() {
        return disciplinas;
    }

    public void addDisciplina(String disciplina) {
        disciplinas.add(disciplina);
    }

    public void setDisciplinas(List<String> disciplinas) {
        this.disciplinas = disciplinas;
    }

}
