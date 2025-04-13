package fatec.poo.model;

/**
 *
 * @author Filipe
 */
public class Turma {
    private String sigla;
    private int qtdevagas;
    private Aluno[] alunos;
    private int numAlunos;
    private Professor professor;
    private Curso curso;
    
    
    public Turma(String sigla, int qtdevagas){
        this.sigla = sigla;
        this.qtdevagas = qtdevagas;
        alunos = new Aluno[qtdevagas];
    }
    public String getSigla(){
        return sigla;
    }
    public int getQtdeVagas(){
        return qtdevagas;
    }
    public void addAluno(Aluno a){
        alunos[numAlunos] = a;
        numAlunos++;
    }
    public void setProfessor(Professor professor){
        this.professor = professor;
    }
    public void setCurso(Curso curso){
        this.curso = curso;
    }
    public Professor getProfessor(){
        return professor;
    }
    public Curso getCurso(){
        return curso;
    }
    public void listarAlunos(){
        System.out.println("\n\n*****Lista de Frequência*****");
        System.out.println("\nSigla do Curso: " + getCurso().getSigla() +
                            "\t\tNome do Curso: " + getCurso().getDescricao());
        System.out.println("Sigla da Turma: " + getSigla());
        System.out.println("Nome do Professor: " + getProfessor().getNome());
        
        System.out.println("\n\tNome do Aluno");
        for (int x = 0; x < numAlunos; x++){
            System.out.println((x+1)+ " - " + alunos[x].getNome());
        }
            
    }
}
