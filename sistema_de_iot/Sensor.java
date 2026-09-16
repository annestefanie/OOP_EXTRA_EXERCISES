public abstract class Sensor {
    protected String identificador;
    protected double leituraAtual;

    public Sensor(String identificador, double leituraAtual){
        this.identificador = identificador;
        this.leituraAtual = leituraAtual;
    }

    public abstract void lerDados();

    public String getIdentificador(){
        return identificador;
    }
    
    public double leituraAtual(){
        return leituraAtual;
    }
}
