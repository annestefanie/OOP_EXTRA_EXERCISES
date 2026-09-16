public class ContaCorrente extends ContaBancaria{
    protected double limiteEspecial;

    public ContaCorrente(String numeroConta, double saldo, double limiteEspecial){
        super(numeroConta, saldo);
        this.limiteEspecial = limiteEspecial;
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException{
        if(saldo + limiteEspecial < valor){
            throw new SaldoInsuficienteException("O valor que deseja sacar é superior ao seu limite e saldo.");
        }
    }
    @Override
    public void depositar(double valor) {
        super.depositar(valor);
    }
    @Override
    public void exibirResumo() {
        saldo += limiteEspecial;
        super.exibirResumo();
    }
}
