import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args){
        List<FormaDePagamento> fila = new ArrayList<>();

        fila.add(new Pix("usuario@gmail.com", 200.0));
        fila.add(new Cartao("122823939", 3.50, 400.0));
        fila.add(new Pix("111111111111", 1000.0));

        ProcessadorDeCheckout checkout = new ProcessadorDeCheckout();
        checkout.processarLista(fila);
    }
}
