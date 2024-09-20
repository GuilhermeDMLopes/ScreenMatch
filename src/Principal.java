import br.com.alura.screenmatch.calculos.CaluladoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
//        Filme meuFilme = new Filme();
//        meuFilme.setNome("Star Wars");
        Filme meuFilme = new Filme("Star Wars", 1980);
//        meuFilme.setAnoDeLancamento(1980);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avaliaFilme(8);
        meuFilme.avaliaFilme(5);
        meuFilme.avaliaFilme(10);
        //System.out.println(meuFilme.somaDasAvaliacoes);
        //System.out.println(meuFilme.getTotalDeAvaliacoes());
        //System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2000);
//        lost.setNome("Lost");
//        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        //System.out.println("Duração total da Serie: " + lost.getDuracaoEmMinutos());

//        Filme outroFilme = new Filme();
//        outroFilme.setNome("Avatar");
        Filme outroFilme = new Filme("Avatar", 2023);
//        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        //Usando calculadora
        CaluladoraDeTempo calculadora = new CaluladoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        //System.out.println(calculadora.getTempoTotal());

        //Utilizando recomendação
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        //Outra forma de instanciar Filme
        //var filmeDoGui = new Filme();
        var filmeDoGui = new Filme("Velozes e Furiosos", 2024);
        filmeDoGui.setDuracaoEmMinutos(280);
//        filmeDoGui.setNome("Velozes e Furiosos");
//        filmeDoGui.setAnoDeLancamento(2024);
        filmeDoGui.avaliaFilme(10);

        //Criando lista de Filmes
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        //Adicionando filmes a lista
        listaDeFilmes.add(filmeDoGui);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme da lista: " + listaDeFilmes.get(0).getNome());
        System.out.println("Filmes da lista: " + listaDeFilmes.toString());


    }
}
