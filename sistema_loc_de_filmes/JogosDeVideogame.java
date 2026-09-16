public class JogosDeVideogame extends Midia{
    protected String desenvolvedor;

    public JogosDeVideogame(String titulo, int anoLancamento, boolean disponivel, double valor, String desenvolvedor){
        super(titulo, anoLancamento, disponivel, valor);
        this.desenvolvedor = desenvolvedor;
    }

    // GETTERS 
    public String getDesenvolvedor(){
        String upperDesenvolvedor= upper(desenvolvedor);
        return upperDesenvolvedor;
    }

    // SETTERS 
    public void setDesenvolvedor(String novoDesenvolvedor){
        if(novoDesenvolvedor != null && !novoDesenvolvedor.isEmpty()){
            desenvolvedor = novoDesenvolvedor;
            System.out.println("Desenvolvedor alterado com sucesso!");
        }
        else {
            System.out.println("Desenvolvedor inválido!");
        }
    }

    @Override
    public void calcularMulta(int diasDeAtraso) {
        double multa = 10.0;

        if(diasDeAtraso >= 1){
            multa *= diasDeAtraso;
            System.out.println("Valor da Multa: " + multa);
            System.out.println("Dias de Atraso: " + diasDeAtraso);
        } else {
            System.out.println("Sem multas. Devolvido conforme o prazo estabelecido.");
        }
    }

    @Override
    public void mostrarStatus() {
        System.out.println("TIPO: JOGO DE VIDEOGAME");
        System.out.println("TÍTULO: " + titulo);
        System.out.println("ANO DE LANÇAMENTO: " + anoLancamento);
        System.out.println("DISPONIBILIDADE: " + disponivel);
        System.out.println("EMPRESA DESENVOLVEDORA: " + desenvolvedor);
    }
}
