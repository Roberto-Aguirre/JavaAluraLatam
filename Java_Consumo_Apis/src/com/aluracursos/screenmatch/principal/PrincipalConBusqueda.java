package com.aluracursos.screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

public class PrincipalConBusqueda {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la pelicula a buscar: ");
        var peliculaUsuario = input.nextLine();

        String peliculaPeticion = "http://www.omdbapi.com/?t="+peliculaUsuario+"&apikey=57bedfc9";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(peliculaPeticion))
                .build();
        
         HttpResponse<String> response = client.send(request, BodyHandlers.ofString()); 

         System.out.println(response.statusCode());
         System.out.println(response.body());
    }
}
