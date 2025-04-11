package model.entity;

import java.util.ArrayList;
import java.util.List;

import model.Pessoa;

public class Aluno extends Pessoa{

    private long matricula;
    private String curso;
    private List<String> cadeiras = new ArrayList<>();

    @Override
    public void exibirDados() {
        System.out.println("=========================");
        System.out.println("Informações do Aluno:");
        System.out.printf("Nome: %s \n", getNome());
        System.out.printf("Cpf: %d \n", getCpf());
        System.out.printf("Idade: %d \n", getIdade());
        System.out.printf("Matrícula: %d \n", matricula);
        System.out.printf("Curso: %s \n", curso);
        System.out.printf("Cadeira/s: %s \n", String.join(", ", cadeiras));
        System.out.println("=========================");

    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public List<String> getCadeiras(){
        return cadeiras;
    }

    public void setCadeiras(List<String> cadeiras){
        this.cadeiras = cadeiras;
    }

    public void addCadeira(String cadeira){
        cadeiras.add(cadeira);
    }

}
