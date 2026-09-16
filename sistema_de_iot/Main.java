import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        SensorPresenca sensorPresenca = new SensorPresenca("PRESENÇA-01", 1);
        SensorPressao pressaoNormal = new SensorPressao(100.0, 101.2, "PRESSÃO-01");
        SensorPressao pressaoAlta = new SensorPressao(100.0, 36.6, "PRESSÃO-02");
        SensorTemperatura sensorTemperatura = new SensorTemperatura("Celsius", 36.5, "TEMPERATURA-01");
        
        sensorTemperatura.calibrar();
        
        List<Sensor> fila = new ArrayList<>();
        fila.add(sensorTemperatura);
        fila.add(sensorPresenca);
        fila.add(pressaoAlta);
        fila.add(pressaoNormal);

        GerenciadorDeMonitoramento gerenciador = new GerenciadorDeMonitoramento();
        gerenciador.monitorarTodos(fila);
    }
}
