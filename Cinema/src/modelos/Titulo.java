package modelos;

public class Titulo implements Comparable <Titulo> {
    private int anoDeLancamento;
    private boolean incluiuNoPlano;
    private int duracaoEmMinutos;
    private String nome;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;

    public Titulo(String nome,int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
        this.nome = nome;
    }

    /* Getters */

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluiuNoPlano() {
        return incluiuNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public String getNome() {
        return nome;
    }

    /* Setters */

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluiuNoPlano(boolean incluiuNoPlano) {
        this.incluiuNoPlano = incluiuNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    /* Comportamentos */

    public void exibicao(){
        System.out.println(nome + " (" + anoDeLancamento + ")");
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double mediaDasAvaliacoes(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
