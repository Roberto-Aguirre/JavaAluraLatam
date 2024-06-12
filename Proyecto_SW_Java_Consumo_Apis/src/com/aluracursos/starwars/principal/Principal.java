package com.aluracursos.starwars.principal;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.aluracursos.starwars.modelos.Pelicula;
import com.aluracursos.starwars.modelos.PeliculaSWAPI;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Principal {

    public static void main(String[] args) throws IOException {
        Scanner inputTeclado = new Scanner(System.in);
        List<Pelicula> listaPeliculas = new ArrayList<>();
        
        while (true) {
        
    
        System.out.println("""
        
        Ingrese un valor entero del capitulo de Star Wars a buscar.
        Nota: Se encuentran por ordenadas por fecha de salida.
        """);
        
        var peliculaBuscar = inputTeclado.nextLine();
        if (peliculaBuscar.equals("salir")) {
        break;    
        }
        String urlApi = "https://swapi.dev/api/films/" + peliculaBuscar;
    

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(urlApi)).build();

            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            String json = response.body();
            // System.out.println(json);

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            PeliculaSWAPI peliculaSWAPI = gson.fromJson(json, PeliculaSWAPI.class);
            Pelicula pelicula = new Pelicula(peliculaSWAPI);
            System.out.println(pelicula.toString());
            listaPeliculas.add(pelicula);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    FileWriter filewriter = new FileWriter("StarWars.json");
    filewriter.write(gson.toJson(listaPeliculas));
    filewriter.close();
    System.out.println(listaPeliculas);
    }

}
