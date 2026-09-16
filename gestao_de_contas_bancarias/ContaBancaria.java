public class ContaBancaria {
    protected String numeroConta;
    protected double saldo;

    public ContaBancaria(String numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void depositar(double valor){ this.saldo += valor; }
    public void sacar(double valor) throws SaldoInsuficienteException {
        if(valor > saldo){
            throw new SaldoInsuficienteException("Saldo Insuficente! Valor pretendido de saque: " + valor + " | Saldo: " + saldo);
        } 
        this.saldo -= valor;
        System.out.println("Saque concluído com sucesso! Saque: " + valor + " | Novo Saldo: " + saldo);
    }
    public void exibirResumo(){
        System.out.println("====RESUMO====");
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Saldo: " + saldo);
    }
}
