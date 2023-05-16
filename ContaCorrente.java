public class ContaCorrente extends Conta{

    public ContaCorrente( String _nomeCliente, int _numConta, float _saldo){
        super(_nomeCliente, _numConta, _saldo);
    }

    public void saque( float valor){
        saldo = (float) (valor - 0.02);
    }
}
