package calculo;

public class FiltroRecomendacao {
    
    public void filtra (Classificavel classificavel){
        if(classificavel.getClassificacao() >= 4){
            System.out.println("Entre os preferidos do momento");
        } else if( classificavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado no momento");
        } else {
            System.out.println("Coloque na lista");
            }
    }
}
 