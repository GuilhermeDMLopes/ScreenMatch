package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

import static java.util.Collection.*;

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

        //Estudando ordenação
        List<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Guilherme");
        System.out.println(buscaPorArtista);

        //Ordenando em si. Como é string, ele faz por ordem alfabetica
        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação: " + buscaPorArtista);

        //Para demais objetos (sem ser variaveis primitivas e string)
        //Devemos configurar o que e como comparar para ser ordenado
        System.out.println("Lista de titulos ordenados: ");
        Collections.sort(listaDeAssistidos);
        System.out.println(listaDeAssistidos);
        //Outra forma de comparar por nome
//        listaDeAssistidos.sort(Comparator.comparing(Titulo::getNome));
        //Ordenando por ano
        listaDeAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(listaDeAssistidos);

    }
}
