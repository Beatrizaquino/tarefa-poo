public class Conta {

    private String nomeCliente;
    private int numero;
    private float saldo;

    public Conta(String nomeCliente, int numero, float saldo) {
        this.nomeCliente = nomeCliente;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public int getNumero() {
        return numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean sacar(double valorSaque) {
        if (saldo >= valorSaque) {
            saldo -= valorSaque;
            return true;
        } else {
            System.out.println("Saldo insuficiente");
            return false;
        }
    }

    public void deposito(double valorDeposito) {
        saldo += valorDeposito;
    }

    public void transferir(Conta contaDestino, double valorTransferencia) {
        if (this.sacar(valorTransferencia)) {
            contaDestino.deposito(valorTransferencia);
            System.out.println("Transferência realizada com sucesso.");
        } else {
            System.out.println("Transferência não realizada.");
        }
    }

    /**
     * @param valorSaque
     */
    public void sacar(float valorSaque) {
        this.sacar(valorSaque);
    }
}
