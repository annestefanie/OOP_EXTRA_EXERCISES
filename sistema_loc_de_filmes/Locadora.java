import java.util.List;

public class Locadora {
    public void gerenciarAlugueis(List<Midia> alugueis){
        for(Midia m : alugueis){
            m.mostrarStatus();

            if(m instanceof Filmes filme){
                filme.calcularMulta(0);
                filme.alugar();
                System.out.println("-----------------------");
            }
            
            if(m instanceof JogosDeVideogame jogo){
                jogo.calcularMulta(0);
                jogo.alugar();
                System.out.println("-----------------------");
            }
        }
    }
}
