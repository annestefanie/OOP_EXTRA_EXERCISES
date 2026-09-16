import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ContaBancaria> contas = new ArrayList<>();

        ContaCorrente c1 = new ContaCorrente("101010", 100.5, 10.6);
        ContaInvestimento c2 = new ContaInvestimento("202020", 100.5, 0.15);

        contas.add(c1);
        contas.add(c2);

        try {
            c2.sacar(1000.0);
        } catch (SaldoInsuficienteException e){
            System.out.println("Falha na operação: " + e.getMessage()); 
        }

        c2.depositar(500.0);
        c2.aplicarRendimento(0.015);

        ProcessadorDeContas processando = new ProcessadorDeContas();
        processando.executarRendimentos(contas);

        for (ContaBancaria c : contas) {
            c.exibirResumo();
        }
    }
}
