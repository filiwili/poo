package fatec.poo.model;

/**
 *
 * @author Filipe
 */
public class PessoaJuridica extends Pessoa{
    private String cgc;
    private double taxaIncentivo;

    public PessoaJuridica(String c, String n,int anoIns){
        super(n,anoIns);
        cgc = c;
    }
    public double calcBonus(int anoAtual){        
       return (taxaIncentivo/100 * getTotalCompras()) * (anoAtual - getAnoInscricao()) ;   
    }
    public String getCGC() {
        return cgc;
    }

    public double getTaxaIncentivo() {
        return taxaIncentivo;
    }

    public void setTaxaIncentivo(double txInc) {
        taxaIncentivo = txInc;
    }    
}
