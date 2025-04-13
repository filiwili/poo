package fatec.poo.model;

/**
 *
 * @author Filipe
 */
public class Professor extends Pessoa {
    private String regFunc;
    private int titularidade;
    private int areaAtuacao;
    private Turma[] turmas;
    private int numTurma;
    
    public Professor(String regFunc, String nome){
        super(nome);
        this.regFunc = regFunc;
        turmas = new Turma[5];
    }
    public void setTitularidade(int titularidade){
        this.titularidade = titularidade;
    }
    public void setareaAtuacao (int areaAtuacao){
        this.areaAtuacao = areaAtuacao;
    }
    public String getRegFunc(){
        return regFunc;
    }
    public int getTitularidade(){
        return titularidade;
    }
    public int getAreaAtuacao(){
        return areaAtuacao;
    }
    public void addTurma(Turma t){
        turmas[numTurma] = t;
        numTurma++;
    }
    
}
