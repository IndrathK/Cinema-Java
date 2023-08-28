package Principal;

import calculo.FiltroRecomendacao;
import calculo.calculadoraDeTempo;
import modelos.Episodio;
import modelos.Filme;
import modelos.Serie;
import modelos.Titulo;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) throws Exception {

        Filme meuFilme = new Filme("O Poderoso Chefão", 1972);
        meuFilme.setIncluiuNoPlano(true);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibicao();
        meuFilme.avalia(9.5);
        meuFilme.avalia(5.5);
        meuFilme.avalia(6.5);

        /* System.out.println(meuFilme.somaDasAvaliacoes); */
        System.out.println("Total de Avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média das Avaliações: " + meuFilme.mediaDasAvaliacoes());

        Serie lost = new Serie("Lost",2000);
        lost.exibicao();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(16);
        lost.setMinutosPorEpisodio(50);


        System.out.println("Duração da maratona: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar",2009);
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(300);

        Serie twd = new Serie("The Walking Dead",2010);
        twd.exibicao();
        twd.setTemporadas(10);
        twd.setEpisodiosPorTemporada(16);
        twd.setMinutosPorEpisodio(180);

        calculadoraDeTempo calculadora = new calculadoraDeTempo();
        calculadora.inclui(twd);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio("Pilot",2010);
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDan = new Filme("Rise",2010);
        filmeDan.setDuracaoEmMinutos(180);
        filmeDan.avalia(10);

        ArrayList<Titulo> lista = new ArrayList<>();
        System.out.println("Tamanho da lista: " + lista.size());
        System.out.println("Primeiro Filme: " + lista.get(0).getNome());
        System.out.println(lista);
        System.out.println("toString: " + lista.get(0).toString());
    }

}
