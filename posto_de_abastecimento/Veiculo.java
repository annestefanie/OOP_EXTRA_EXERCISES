public abstract class Veiculo {
    protected String placa;
    protected double tanqueCapacidade;
    protected double tanqueAtual;

    public Veiculo(String placa, double tanqueAtual, double tanqueCapacidade){
        this.tanqueAtual = tanqueAtual;
        this.tanqueCapacidade = tanqueCapacidade;
        this.placa = placa;
    }

    public void abastecer(double litros) throws TanqueExcedidoException{
        if(tanqueAtual + litros > tanqueCapacidade){
            throw new TanqueExcedidoException("Capacidade exedida! Tanque atual: " + tanqueAtual + "L | Capacidade: " + tanqueCapacidade + "L | Tentativa: " + litros + "L"

            );
        }
        this.tanqueAtual += litros;
        System.out.println(placa + " Abastecido com " + litros + "L | Nível Atual: " + tanqueAtual);  
    }

    public abstract void mostrarStatus();

    public String getPlaca(){
        return placa;
    }
}
