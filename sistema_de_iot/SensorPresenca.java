public class SensorPresenca extends Sensor {
    public SensorPresenca(String identificador, double leituraAtual){
        super(identificador, leituraAtual);
    }

    @Override
    public void lerDados(){
        if(leituraAtual == 1.0){
            System.out.println("Movimento identificado na área do sensor " + identificador + "!");
        } else {
            System.out.println("Sem movimento detectado no sensor " + identificador + ".");
        }
    }
}
