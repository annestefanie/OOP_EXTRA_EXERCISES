import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<Midia> midias = new ArrayList<>();

        Filmes filme1 = new Filmes("Antes do amanhecer", 2000, true, 24.99, "Sei lá", 8.78);
        Filmes filme2 = new Filmes("Antes do entardecer", 2010, false, 24.99, "Sei lá", 7.8);

        JogosDeVideogame jogo1 = new JogosDeVideogame("Mario Kart", 1999, false, 200.0, "Nitendo");
        JogosDeVideogame jogo2 = new JogosDeVideogame("Slenderman", 1980, true, 500.0, "Unknown");


        midias.add(filme1);
        midias.add(filme2);
        midias.add(jogo1);
        midias.add(jogo2);

        Locadora locadora = new Locadora();
        locadora.gerenciarAlugueis(midias);
    }
}-