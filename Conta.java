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
    public bool sacar( ){
        //saldo -= valor;
        float valor = info.nextInt();
        if(saldo <= valor){

        } else {

        }

    }
    //a dirença no polimorfismo está no tipo do parametro passado
    public bool sacar(float){

    }

    public void deposito( double valorDeposito){
        saldo += valorDeposito;
    }

    public void transferir(Conta contaDestino, double valorTransferencia) {
    }

    public void sacar(double valorSaque) {
    }

}