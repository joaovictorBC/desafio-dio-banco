public class Main {

    public static void main(String[] args) {
        Cliente Joao = new Cliente();
        Joao.setNome("João Victor");

        Conta contacorrente = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();

        contacorrente.sacar(200);
        poupanca.depositar(300);

        contacorrente.imprimirInfosComuns();
        poupanca.imprimirInfosComuns();
    }
}
