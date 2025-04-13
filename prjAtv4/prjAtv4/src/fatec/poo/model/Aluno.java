package fatec.poo.model;

/**
 *
 * @author Filipe
 */
public class Aluno extends Pessoa {
    private String ra;
    private int escolaridade;
    
    public Aluno (String ra, String nome){
        super (nome);
        this.ra = ra;
        this.escolaridade = escolaridade;
    }
    public void setEscolaridade(int escolaridade){
        this.escolaridade = escolaridade;
    }
    private String getRa(){
        return ra;
    }
    private int getEscolaridade(){
        return escolaridade;
    }
}
