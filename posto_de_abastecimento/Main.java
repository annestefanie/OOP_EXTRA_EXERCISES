import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> frota = new ArrayList<>();

        frota.add(new Caminhao("ABC-1234", 3, 100.0, 100.0));
        frota.add(new Caminhao("XYZ-9876", 2, 100.0, 120.0));
        frota.add(new CarroEletrico("ELE-2026", 45.0, 0,0));
        
        PostoDeAbastecimento posto = new PostoDeAbastecimento();
        posto.servirFrota(frota);
    }
}
