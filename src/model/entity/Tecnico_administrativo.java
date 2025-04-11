package model.entity;

import model.Pessoa;

public class Tecnico_administrativo extends Pessoa{
    private String setor;
    private String cargo;
   
    @Override
    public void exibirDados(){   
        System.out.println("=========================");
        System.out.println("Informações do Técnico-Administrativo:");
        System.out.printf("Nome: %s \n", getNome());
        System.out.printf("Cpf: %d \n", getCpf());
        System.out.printf("Idade: %d \n", getIdade());
        System.out.printf("Setor: %s \n", setor);
        System.out.printf("Cargo: %s \n", cargo);
        System.out.println("=========================");
    }

    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
