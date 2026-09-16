public class SensorTemperatura extends Sensor implements Calibravel{
    private String unidadeDeMedida;

    public SensorTemperatura(String unidadeDeMedida, double leituraAtual, String identificador){
        super(identificador, leituraAtual);
        this.unidadeDeMedida = unidadeDeMedida;
    }

    @Override
    public void calibrar(){
        leituraAtual = leituraAtual - 0.5;
        System.out.println("Sensor " + identificador + " calibrado com sucesso!");
    }

    @Override
    public void lerDados(){
        System.out.println("TEMPERATURA SENSOR " + identificador + ": " + leituraAtual + " °" + unidadeDeMedida);
    }
}
