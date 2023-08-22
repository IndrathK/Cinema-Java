import calculo.calculadoraDeTempo;
import modelos.Filme;
import modelos.Serie;

public class Principal {
    public static void main(String[] args) throws Exception {
        Filme meuFilme = new Filme();

        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1972);
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

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibicao();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(16);
        lost.setMinutosPorEpisodio(50);

        System.out.println("Duração da maratona: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(300);

        Serie twd = new Serie();
        twd.setNome("The Walking Dead");
        twd.setAnoDeLancamento(2010);
        twd.exibicao();
        twd.setTemporadas(10);
        twd.setEpisodiosPorTemporada(16);
        twd.setMinutosPorEpisodio(180);

        calculadoraDeTempo calculadora = new calculadoraDeTempo();
        /* calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost); */
        calculadora.inclui(twd);
        System.out.println(calculadora.getTempoTotal());
    }

}
