package fatec.poo.model;

/**
 *
 * @author Filipe
 */
public class PedidoCompra {
    private int numero;
    private String dataPedido;
    private double valor;
    private Pessoa pessoa; //multiplicidade 1

    public PedidoCompra(int numero) {
        this.numero = numero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    //retorna o endereço de um objeto da subclasse PessoaFisica ou
    //da subclasse PessoaJuridica
    public Pessoa getPessoa() {
        return pessoa;
    }

    //Tem como parâmetro de entrada o endereço de um
    //objeto da subclasse PessoaFisica ou da subclasse
    //PessoaJuridica
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
