import java.util.List;

public class ProcessadorDeContas {
    public void executarRendimentos(List<ContaBancaria> contas){
        for(ContaBancaria c  : contas){

            if(c instanceof ContaInvestimento investimento){
                investimento.aplicarRendimento(0);
            } 
            
        }
    }
}
