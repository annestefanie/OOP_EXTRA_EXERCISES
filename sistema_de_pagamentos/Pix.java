public class Pix extends FormaDePagamento{
    private String chavePix;

    public Pix(String chavePix, double valor){
        super(valor);
        this.chavePix = chavePix;
    }
    @Override
    public void processarPagamento() {
        valor = valor * 0.9;
        System.out.println("Pagamento via PIX no valor de R$" + valor +  " (10% de desconto) enviado para a chave: " + chavePix);
    }
}
