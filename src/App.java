
import java.util.ArrayList;
import java.util.List;

import model.entity.Aluno;
import model.entity.Professor;
import model.entity.Tecnico_administrativo;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("----------Aluno----------"); 
        List<String> cadeiras = new ArrayList<>();
        cadeiras.add("java");
        cadeiras.add("python");
        
        Aluno alunPessoa = new Aluno("Bruno Prazeres", 22384722581l, 19, 20250155227l, "Análise e Desenvolvimento de Sistema", cadeiras );
      
        alunPessoa.exibirDados();
        System.out.println("Adicionando mais cadeiras diretamente na classe");
        alunPessoa.addCadeira("spring boot");
        alunPessoa.addCadeira("angular");
        alunPessoa.exibirDados();

        System.out.println("----------Professor----------");
        List<String> disciplinas = new ArrayList<>();
        disciplinas.add("java");
        disciplinas.add("sql data-base"); 
        
        Professor profePessoa = new Professor("Fausto", 33484722581L, 35, 1234, disciplinas);
        profePessoa.exibirDados();
        
        System.out.println("Adicionando mais disciplinas diretamente na classe");
        profePessoa.addDisciplina("spring boot");
        profePessoa.addDisciplina("docker");
        profePessoa.exibirDados();
        
        System.out.println("----------Tecnico_administrativo----------");
        Tecnico_administrativo tecnPessoa = new Tecnico_administrativo("Mark", 73684722581l, 25, "TI", "Estagiario");
        tecnPessoa.exibirDados();
    }
}
