package br.com.alura.screenmatch.calculos;

//Criando recomendações baseado na quantidade de estrelas de cada filme
public class FiltroRecomendacao {

    //Retorna a recomendacao do filme/serie/etc
    public void filtra(Classificavel classificavel) {
        if(classificavel.getClaffificacao() >= 4) {
            System.out.println("Esta entre os preferidos do momento");
        } else if (classificavel.getClaffificacao() >= 2) {
            System.out.println("Muito bem avalisado no momento");
        } else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
