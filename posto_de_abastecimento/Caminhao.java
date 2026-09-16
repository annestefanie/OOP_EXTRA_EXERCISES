public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(String placa, int eixos, double tanqueAtual, double tanqueCapacidade){
        super(placa, tanqueAtual, tanqueCapacidade);
        this.eixos = eixos;
    }
    @Override
    public void abastecer(double litros) throws TanqueExcedidoException{
        super.abastecer(litros);
    }

    @Override
    public void mostrarStatus(){
        System.out.println("==STATUS==");
        System.out.println("VEÍCULO: CAMINHÃO");
        System.out.println("TIPO: MOVIDO A COMBUSTÍVEL");
        System.out.println("NÍVEL DE GASOLINA: " + tanqueAtual);
        System.out.println("CAPACIDADE: " + tanqueCapacidade);
        System.out.println("EIXOS: " + eixos);
    }
}
