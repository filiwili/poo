package fatec.poo.model;

/**
 *
 * @author Filipe
 */
public abstract class Pessoa {
    private String nome;
    private int anoInscricao;
    private double totalCompras; 
    private PedidoCompra[] pedidosCompra; //multiplicidade 1..*
    private int numPed;
    
    public Pessoa(String n, int anoIns){
        nome = n;
        anoInscricao = anoIns;     
        pedidosCompra = new PedidoCompra[10];
        numPed = 0;
    }
    
    abstract public double calcBonus(int anoAtual);
    
    public void addCompras(double val){
        totalCompras += val; //totalCompras = totalCompras + val
    }
    
    public String getNome() {
        return nome;
    }

    public int getAnoInscricao() {
        return anoInscricao;
    }

    public double getTotalCompras() {
        return totalCompras;
    }  

    public int getNumPed() {
        return numPed;
    }
    
    public void addPedidoCompra(PedidoCompra pc){
        pedidosCompra[numPed] = pc;
        numPed++;        
    }
}
