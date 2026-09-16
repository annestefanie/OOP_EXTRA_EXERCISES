public class ContaInvestimento extends ContaBancaria {
    protected double taxaDeRendimento;

    public ContaInvestimento(String numeroConta, double saldo, double taxaDeRendimento){
        super(numeroConta, saldo);
        this.taxaDeRendimento = taxaDeRendimento;
    }

    public void aplicarRendimento(double taxaDeRendimento){
        this.saldo += this.saldo * this.taxaDeRendimento;
    }
    @Override
    public void exibirResumo() {
        super.exibirResumo();
        System.out.println("Taxa de rendimento: " + taxaDeRendimento);
    }
}
