import modelos.Filme;

public class Principal {
    public static void main(String[] args) throws Exception {
        Filme meuFilme = new Filme();

        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1972);
        meuFilme.setIncluiuNoPlano(true);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibicao();
        meuFilme.avalia(9.5);
        meuFilme.avalia(5.5);
        meuFilme.avalia(6.5);

        /* System.out.println(meuFilme.somaDasAvaliacoes); */
        System.out.println("Total de Avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média das Avaliações: " + meuFilme.mediaDasAvaliacoes());
    }
}
