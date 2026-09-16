import java.util.List;
public class PostoDeAbastecimento {
    public void servirFrota(List<Veiculo> frota){
        System.out.println("==INICIANDO ATENDIMENTO==");

        for(Veiculo v : frota){
            v.mostrarStatus();

            if(v instanceof Eletrico){
                Eletrico veiculoEletrico = (Eletrico) v;
                veiculoEletrico.carregarBateria(25.0);
            } else {
                try{
                    v.abastecer(50.0);
                } catch (TanqueExcedidoException e){
                    System.out.println("ERRO " + e.getMessage());
                }
            }
        }
    }
}
