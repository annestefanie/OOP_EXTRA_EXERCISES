public class CarroEletrico extends Veiculo implements Eletrico {
    private double nivelBateria;

    public CarroEletrico(String placa, double nivelBateria, double tanqueAtual, double tanqueCapacidade){
        super(placa,  0.0,0.0);
        this.nivelBateria = nivelBateria;
    }

    @Override
    public void abastecer(double litros) throws TanqueExcedidoException{
        throw new TanqueExcedidoException("Veículos elétricos não aceitam combustível");
    }

    @Override
    public void carregarBateria(double kwh){
        if(nivelBateria >= 100){
            System.out.println("A bateria já está carregada!");
        } else {
            nivelBateria = nivelBateria + kwh;
            System.out.println("Bateria carregada com sucesso! Nível atual: " + nivelBateria);
        }
    }

    @Override
    public void mostrarStatus(){
        System.out.println("== STATUS ==");
        System.out.println("VEÍCULO: CARRO");
        System.out.println("TIPO: ELÉTRICO");
        System.out.println("NÍVEL DE BATERIA: " + nivelBateria);
    }
}
