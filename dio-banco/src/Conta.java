public abstract class Conta implements iConta {
    protected int agencia;
    protected int numero;
    protected double saldo = 0;
    private static final int AGENCIA_PADRAO = 0;
    protected Cliente cliente;

    private static int SEQUENCIAL = 1;

    public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

    public void sacar(double retirado, double saldo){
        if ( retirado > saldo){
            System.out.println("Não é possível a retirada");
        } else{
            System.out.println("Retirada feita com sucesso");
            double novoSaldo = retirado - saldo;
            saldo = novoSaldo;
        }
    }
    public void depositar(double adicionado, double saldo){
        adicionado = 10.1;
        double novoSaldo = adicionado + saldo;
        saldo = novoSaldo;
        }
    public void transferir(double transferido, double saldo){
        transferido = 10.1;
        if (transferido > saldo){
            System.out.println("Não é possível a transferÊncia");
        } else {
            System.out.println("Transferência concluída");
            double novoSaldo = transferido - saldo;
            saldo = novoSaldo;
        }
    }
    protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

    //somente os gets estão aí, pois os setters podem ser modificados e não queremos que as pessoas possam modificar esses campos
    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void sacar(double valor) {
    }
    public void depositar(double valor) {
    }
    public void transferir(double valor, Conta contaDestino) {
    
    }
}
