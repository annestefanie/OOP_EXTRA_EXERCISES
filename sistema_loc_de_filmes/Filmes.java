public class Filmes extends Midia{
    protected String diretor;
    protected double notaIMDB;

    public Filmes(String titulo, int anoLancamento, boolean disponivel, double valor, String diretor, double notaIMDB){
        super(titulo, anoLancamento, disponivel, valor);
        this.diretor = diretor;
        this.notaIMDB = notaIMDB;
    }

    // GETTERS 
    public String getDiretor(){
        String upperDiretor = upper(diretor);
        return upperDiretor;
    }

    public double getNotaIMBD(){
        return notaIMDB;
    }

    // SETTERS 
    public void setDiretor(String novoDiretor){
        if(novoDiretor != null && !novoDiretor.isEmpty()){
            diretor = novoDiretor;
            System.out.println("Diretor alterado com sucesso!");
        }
        else {
            System.out.println("Diretor inválido!");
        }
    }

    public void setNotaIMDB(double novaNota){
        notaIMDB = novaNota;
        System.out.println("Nota IMBD alterada com sucesso!");
    }

    @Override
    public void calcularMulta(int diasDeAtraso) {
        double multa;
        
        if(diasDeAtraso >= 1){
            multa = diasDeAtraso * 10.0;
            System.out.println("Valor da Multa: " + multa);
            System.out.println("Dias de Atraso: " + diasDeAtraso);
        } else {
            System.out.println("Sem multas. Devolvido conforme o prazo estabelecido.");
        }
        
    }

    @Override
    public void mostrarStatus() {
        System.out.println("TIPO: FILME");
        System.out.println("TÍTULO: " + titulo);
        System.out.println("ANO DE LANÇAMENTO: " + anoLancamento);
        System.out.println("DISPONIBILIDADE: " + disponivel);
        System.out.println("DIRETOR: " + diretor);
        System.out.println("NOTA IMDB: " + notaIMDB);
    }

}