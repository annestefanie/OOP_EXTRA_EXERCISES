import java.util.List;

public class GerenciadorDeMonitoramento {
    public void monitorarTodos(List<Sensor> sensores){
        for (Sensor n : sensores){
            n.lerDados();
        }
    }
}
