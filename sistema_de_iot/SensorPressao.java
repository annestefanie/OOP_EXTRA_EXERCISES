public class SensorPressao extends Sensor implements Calibravel{
    private double pressaoLimite;

    public SensorPressao(double pressaoLimite,double leituraAtual, String identificador){
        super(identificador, leituraAtual);
        this.pressaoLimite = pressaoLimite;
    }

    @Override
    public void calibrar(){
        leituraAtual = 0.0;
        System.out.println("Sensor " + identificador + " zerado e calibrado com suscesso.");
    }

    @Override
    public void lerDados(){
        if(leituraAtual > pressaoLimite){
            System.out.print("Alerta! Sensor " + identificador + " com " + leituraAtual + " excede o limite de " + pressaoLimite + " PSI!");
        } else {
            System.out.println("Sensor " + identificador + " com pressão de " + leituraAtual + " em níveis normais.");
        }
    }
}
