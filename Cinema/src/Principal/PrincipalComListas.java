package Principal;

import modelos.Filme;
import modelos.Serie;
import modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1972);
        meuFilme.avalia(10);
        Serie lost = new Serie("Lost",2000);
        lost.avalia(9);
        Filme outroFilme = new Filme("Avatar",2009);
        outroFilme.avalia(8);
        Serie twd = new Serie("The Walking Dead",2010);
        twd.avalia(7);
        var filmeDan = new Filme("Rise",2010);
        filmeDan.avalia(9);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(outroFilme);
        lista.add(filmeDan);
        lista.add(meuFilme);
        lista.add(twd);
        lista.add(lost);

        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }
        Collections.sort(lista);
        System.out.println("Lista ordenada: " + lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Lista ordenada por ano: " + lista);
    }
}
