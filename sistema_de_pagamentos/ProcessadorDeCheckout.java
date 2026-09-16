import java.util.List;

public class ProcessadorDeCheckout {
    public void processarLista(List<FormaDePagamento> pagamentos){
        System.out.println("Processando fila de pagamentos....");
        for (FormaDePagamento p : pagamentos){
            p.processarPagamento();
        }
        System.out.println("-------------------------------------------");
    }
}
