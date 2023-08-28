package modelos;

import calculo.Classificavel;

public class Filme extends Titulo implements Classificavel {
   private String diretor;

   /*Construtor*/
    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public String getDiretor() {
    return diretor;
}

public void setDiretor(String diretor) {
    this.diretor = diretor;
}

/*Sobreescritas*/
@Override
public int getClassificacao() {

    return (int) mediaDasAvaliacoes() / 2;
}
@Override
public String toString() {
    return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
}

    @Override
    public int compareTo(Titulo o) {
        return 0;
    }
}