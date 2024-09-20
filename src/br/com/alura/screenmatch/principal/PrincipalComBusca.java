package br.com.alura.screenmatch.principal;

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
        String endereco = "http://www.omdbapi.com/?t=" + busca + "&apikey=8ed9a188";

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
        System.out.println(response.body());
    }
}
