public class Conta{

    String nomeCliente;
    private int numConta;
    public float saldo;

    public Conta(String nomeCliente, int _numConta, float _saldo){
        this.nomeCliente = nomeCliente;
        this.saldo = 0;
        this.numConta = 1;
    }

    public String getNomeCliente(){
        return nomeCliente;
    }
    public int getNumConta(){
        return numConta;
    }
    public float getSaldo(){
        return saldo;
    }
    

    //metoDO SAQUE
    public void saque( float valor){
        saldo -= valor;
    }

    public void deposito( double valorDeposito){
        saldo += valorDeposito;
    }

    public void transferir(Conta contaDestino, double valorTransferencia) {
    }

    public void sacar(double valorSaque) {
    }

}