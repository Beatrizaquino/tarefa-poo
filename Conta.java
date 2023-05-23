public class Conta{

    String nomeCliente;
    private int numero;
    private float saldo;

    public Conta(String nomeCliente, int _numero, float _saldo){
        this.nomeCliente = nomeCliente;
        this.saldo = 0;
        this.numero = 1;
    }

    public String getNomeCliente(){
        return nomeCliente;
    }
    public int getNumero(){
        return numero;
    }
    public float getSaldo(){
        return saldo;
    }
    

    //metoDO SAQUE
    //utilizar polimorfismo para utilizar outro método com parametros diferentes
    public bool sacar(float valor ){
        saldo -= valor;
        if(this.saldo <= valor){
            sacar(valor);
            Object destino;
            destino.deposita(valor);
            return true;
        } else {
             System.out.println("Saldo insuficiente");
             return false;
        }

    }
    //a dirença no polimorfismo está no tipo do parametro passado
    public bool sacar(){

    }

    public void deposito( double valorDeposito){
        saldo += valorDeposito;
    }

    public void transferir(Conta contaDestino, double valorTransferencia) {
    }

    public void sacar(double valorSaque) {
    }

}