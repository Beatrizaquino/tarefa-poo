import java.util.List;

public class Banco {
    
    private List<Conta> contas;

    public void adicionarConta( Conta conta){
        contas.add(conta);
    }
}
