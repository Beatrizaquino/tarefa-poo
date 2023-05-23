import java.util.List;
import java.util.Scanner;

public class Banco {
    
    private List<Conta> contas;
    private int proximoNumeroDaConta = 1;

    public void cadastrarConta( String nomeCliente){
        Conta novaConta = new Conta(null, proximoNumeroDaConta, proximoNumeroDaConta);
        contas.add(novaConta);
        System.out.println("Conta cadastrada");
    }

        public void listarContas() {
            if (contas.isEmpty()) {
                System.out.println("Não existe contas");
            } else {
                
            }
        }

    public void EscolherConta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma conta");
        listarContas();
        System.out.println("Digite o número da conta");
        int numero = scanner.nextInt();
        Conta c = (Conta) FindConta(numero);
        if(c != null) {
           System.out.println("Saldo: " +c.getSaldo());
        } else {
            System.out.println("Conta não encontrada");
        }
    }

    public Object FindConta(int numero) {
        for (Conta c : contas) {
            if
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            (c.getNumero() == numero){
                return c;
            }
        }
        return null;
    }

    public Conta buscarConta( int numConta) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numConta) {
                return conta;
            }
        }
        return null;
    }

    // public void adicionarConta( Conta conta){
    //     Scanner scanner = new Scanner();

    //     contas.add(conta);

    // }
}
