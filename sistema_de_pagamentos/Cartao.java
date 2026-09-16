public class Cartao extends FormaDePagamento implements Autenticavel{
    private String numeroCartao;
    private double taxaFixa;

    public Cartao(String numeroCartao, double taxaFixa, double valor){
        super(valor);
        this.numeroCartao = numeroCartao;
        this.taxaFixa = taxaFixa;
    }

    @Override
    void processarPagamento() {
        valor = valor + taxaFixa;
        System.out.println("Pagamento via Cartão " + numeroCartao + " processado. Valor total com taxa: R$" + valor);
    }

    @Override
    public boolean autenticar(String token){
        return token != null && token.length() >= 6;
    }
}
