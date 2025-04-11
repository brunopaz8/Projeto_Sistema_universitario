
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
        
        Aluno alunPessoa = new Aluno();
        alunPessoa.setCpf(22384722581l);
        alunPessoa.setMatricula(20250155227l);
        alunPessoa.setCurso("Análise e Desenvolvimento de Sistema");
        alunPessoa.setIdade(19);
        alunPessoa.setNome("Bruno Prazeres");
        alunPessoa.setCadeiras(cadeiras);
        alunPessoa.exibirDados();
        System.out.println("Adicionando mais cadeiras diretamente na classe");
        alunPessoa.addCadeira("spring boot");
        alunPessoa.addCadeira("angular");
        alunPessoa.exibirDados();

        System.out.println("----------Professor----------");
        
        List<String> disciplinas = new ArrayList<>();
        disciplinas.add("java");
        disciplinas.add("sql data-base"); 
        
        Professor profePessoa = new Professor();
        profePessoa.setCpf(33484722581L);
        profePessoa.setDisciplinas(disciplinas);
        profePessoa.setIdade(35);
        profePessoa.setNome("Fausto");
        profePessoa.setSiape(1234);
        profePessoa.exibirDados();
        System.out.println("Adicionando mais disciplinas diretamente na classe");
        profePessoa.addDisciplina("spring boot");
        profePessoa.addDisciplina("docker");
        profePessoa.exibirDados();
        
        System.out.println("----------Tecnico_administrativo----------");
        Tecnico_administrativo tecnPessoa = new Tecnico_administrativo();
        tecnPessoa.setCargo("estagiario");
        tecnPessoa.setCpf(73684722581l);
        tecnPessoa.setIdade(25);
        tecnPessoa.setNome("Leonardo");
        tecnPessoa.setSetor("ti");
        tecnPessoa.exibirDados();
    }
}
