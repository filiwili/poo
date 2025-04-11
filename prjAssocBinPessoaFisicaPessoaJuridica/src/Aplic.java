import fatec.poo.model.PedidoCompra;
import fatec.poo.model.PessoaFisica;
import fatec.poo.model.PessoaJuridica;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Filipe
 */

public class Aplic {
    public static void main(String[] args) {       
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        PessoaFisica pf; 
        PessoaJuridica pj;
        PedidoCompra[] cadPedidos = new PedidoCompra[10];
        
        int nPed, opcao, anoInsc;
        String cpf_cgc, nome, dtPed;
        double valPed, valBase, txIncentivo;
        
        System.out.print("Digite o cpf: ");
        cpf_cgc = entrada.next();
        System.out.print("Digite o nome: ");
        nome = entrada.next();
        System.out.print("Digite a data de inscrição (aaaa): ");
        anoInsc = entrada.nextInt();
        
        //Instanciação do objeto da classe PessoaFisica
        pf = new PessoaFisica(cpf_cgc, nome ,anoInsc);
        
        System.out.print("Digite o valor base (R$): ");
        valBase = entrada.nextDouble();
        pf.setBase(valBase); //Passagem de mensagem
        
        System.out.print("\nDigite o cgc: ");
        cpf_cgc = entrada.next();
        System.out.print("Digite o nome: ");
        nome = entrada.next();
        System.out.print("Digite a data de inscrição (aaaa): ");
        anoInsc = entrada.nextInt();
        
        //Instanciação do objeto da classe PessoaJuridica
        pj = new PessoaJuridica(cpf_cgc, nome ,anoInsc);
        
        System.out.print("Digite a taxa de incentivo(%): ");
        txIncentivo = entrada.nextDouble();              
        pj.setTaxaIncentivo(txIncentivo); //Passagem de mensagem
           
        for(int x=0; x < 10; x++){
            System.out.print("Digite o número do pedido: ");
            nPed = entrada.nextInt();
            
            //Instanciação do objeto da classe PessoaJuridica
            cadPedidos[x] = new PedidoCompra(nPed); 
            System.out.print("Digite a data do pedido (dd/mm/aaaa): ");
            dtPed = entrada.next();
            cadPedidos[x].setDataPedido(dtPed); //Passagem de mensagem
            System.out.print("Digite o valor do pedido: ");
            valPed = entrada.nextDouble();
            cadPedidos[x].setValor(valPed); //Passagem de mensagem
            
            System.out.println("Selecione [1]Pessoa Física  [2]Pessoa Juridica: ");
            opcao = entrada.nextInt();
            if (opcao == 1){
                //Efetivando a associação binária bidirecional
                //entre objeto PessoaFisica e o objeto PedidoCompra
                pf.addPedidoCompra(cadPedidos[x]); //multiplicidade 1..*
                cadPedidos[x].setPessoa(pf); //multiplicidade 1 
                pf.addCompras(cadPedidos[x].getValor());                          
            }else{
                //Efetivando a associação binária bidirecional
                //entre objeto PessoaJuridica e o objeto PedidoCompra
                pj.addPedidoCompra(cadPedidos[x]); //multiplicidade 1..*
                cadPedidos[x].setPessoa(pj); //multiplicidade 1
                pj.addCompras(cadPedidos[x].getValor());                
            }
        }
        
        System.out.println("Ano Atual: " + 2025);
        System.out.println("\nPessoa Física");        
        System.out.println("CPF: " + pf.getCPF());
        System.out.println("Nome: " + pf.getNome());
        System.out.println("Qtde. Pedidos: " + pf.getNumPed());
        System.out.println("Total Compras: " + df.format(pf.getTotalCompras()));
        System.out.println("Bonus: " + df.format(pf.calcBonus(2025)));
        
        System.out.println("\n\nPessoa Jurídica");
        System.out.println("CGC: " + pj.getCGC());
        System.out.println("Nome: " + pj.getNome());  
        System.out.println("Qtde. Pedidos: " + pj.getNumPed());
        System.out.println("Total Compras: " + df.format(pj.getTotalCompras()));
        System.out.println("Bonus: " + df.format(pj.calcBonus(2025)));
    }
}
