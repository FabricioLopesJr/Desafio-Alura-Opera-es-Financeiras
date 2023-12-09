public class ContaCorrente {

    String nome;
    String tipoConta;
    double saldo = 0.0;

    public ContaCorrente() {
        nome = "Jacqueline Oliveira";
        tipoConta = "Corrente";
        saldo = 2500.00;
    }

    public String getNome() {
        return nome;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public double getSaldoInicial() {
        return saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void receberValor(double dinheiroRecebido) {
        this.saldo += dinheiroRecebido;
    }

    public void transfereValor(double valorDaTransferencia) {
        if (this.saldo >= valorDaTransferencia) {
            this.saldo -= valorDaTransferencia;
        } else {
            System.out.println("Não há saldo suficiente para fazer essa transferência. Seu saldo atual é R$" + this.saldo);
        }
    }
}
