public abstract class FormaDePagamento {
    protected double valor;

    public FormaDePagamento(double valor){
        this.valor= valor;
    }

    abstract void processarPagamento();
    
    double getValor(){
        return valor;
    }
}
