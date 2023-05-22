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

    public Conta buscarConta( int numConta) {
        for (Conta conta : contas) {
            if (conta.getNumConta() == numConta) {
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
