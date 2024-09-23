package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoExcepetion;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOMDB;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

//Classe para realizar requisições HTTP
//Estamos usando o omdbapi e a chave gerada no e-mail para nossas requisições
public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        //Para criar buscar mais dinamicas
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um filme para a busca: ");
        var busca = leitura.nextLine();
        //Alterando busca para problemas com alguns filmes (top gun por exemplo)
        String endereco = "http://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=8ed9a188";

        try {
            //Instanciando um cliente
            HttpClient client = HttpClient.newHttpClient();

            //Realizando a requisição
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create("http://www.omdbapi.com/?i=tt3896198&apikey=8ed9a188"))
//                .build();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();

            //Pegando resposta da requisição
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            //Exibindo corpo da resposta
            //System.out.println(response.body());

            //Salvando o JSON do response
            String json = response.body();
            System.out.println(json);

            //Utilizando GSON importado pelo arquivo jar
            //Utilizando builder para o nome das variaveis na classe omdb e do JSON, estejam iguais
            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();
            //Transformando um json em uma classe
            //Titulo meuTitulo = gson.fromJson(json, Titulo.class);
            TituloOMDB meuTituloOmdb = gson.fromJson(json, TituloOMDB.class);
            System.out.println(meuTituloOmdb);

            //Exemplo de erro é o gilme divertidamente (ano possui 2018~)
            //Para usar o objeto titulo e seus metodos
            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println("Titulo convertido: " + meuTitulo);
        } catch (NumberFormatException e) {
            System.out.println("Aconteceu um erro: ");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Algum erro aconteceu no argumento da busca, verifique o endereço");
        } catch (ErroDeConversaoDeAnoExcepetion e) {
            System.out.println(e.getMessage());
        }

    }
}
