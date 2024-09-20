package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Star Wars", 1980);
        meuFilme.avaliaFilme(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avaliaFilme(6);
        var filmeDoGui = new Filme("Velozes e Furiosos", 2024);
        filmeDoGui.avaliaFilme(10);
        Serie lost = new Serie("Lost", 2000);

        //Trabalhando com Listas
        ArrayList<Titulo> listaDeAssistidos = new ArrayList<>();
        listaDeAssistidos.add(filmeDoGui);
        listaDeAssistidos.add(meuFilme);
        listaDeAssistidos.add(outroFilme);
        listaDeAssistidos.add(lost);

        //Mostrando itens do array pelo for each
        for (Titulo item: listaDeAssistidos) {
//            System.out.println(item);
            System.out.println(item.getNome());
            //Se for filme, quero pegar a classificação
            //Para isso, fazemos um casting com instanceof
            if (item instanceof Filme filme && filme.getClaffificacao() > 2) {
                System.out.println("Classificação " + filme.getClaffificacao());
            }
        }
    }
}
