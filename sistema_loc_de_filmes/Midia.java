public abstract class Midia {
    protected String titulo;
    protected int anoLancamento;
    protected boolean disponivel;
    protected double valor;

    public Midia(String titulo, int anoLancamento, boolean disponivel, double valor){
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.disponivel = disponivel;
        this.valor = valor;
    }

    public abstract void calcularMulta(int diasDeAtraso);
    public abstract void mostrarStatus();

    public void alugar(){
        if(disponivel == true){
            disponivel = false;
            System.out.printf("Alugado com sucesso. Valor: %.2f ", valor);
        } else {
            System.out.println("Falha na operação. Mídia indisponível.");
        }
    }

    public void devolver(){
        if (disponivel == false) {
            disponivel = true;
            System.out.printf("\nDevolvido com sucesso.\n");   
        } else {
            System.out.println("Falha na operação. Mídia já devolvida.");
        }
    }

    public String upper(String texto){
        return texto.toUpperCase();
    }

    // GETTERS
    public String getTitulo(){
        String upperTitulo = upper(titulo);
        return upperTitulo;
    }

    public int getAnoLancamento(){
        return anoLancamento;
    }

    public boolean getDisponibilidade(){
        return disponivel;
    }

    // SETTERS
    public void setTitulo(String novoTitulo){
        if(novoTitulo != null && !novoTitulo.isEmpty()){
            titulo = novoTitulo;
            System.out.println("Título alterado com sucesso!");
        } else {
            System.out.println("Título inválido!");
        }
    }

    public void setAnoLancameto(int novoAnoLancamento){
        anoLancamento = novoAnoLancamento;
        System.out.println("Ano de laçamento alterado com sucesso!");
    }

    public void setDisponibilidade(boolean novoDisponivel){
        disponivel = novoDisponivel;
        System.out.println("Disponibilidade alterada com sucesso!");
    }

}
