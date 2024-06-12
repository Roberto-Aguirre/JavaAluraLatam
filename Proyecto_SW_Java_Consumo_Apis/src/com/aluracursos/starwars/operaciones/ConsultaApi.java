package com.aluracursos.starwars.operaciones;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.List;

import com.aluracursos.starwars.excepciones.ErrorNoExiste;
import com.aluracursos.starwars.modelos.Pelicula;
import com.aluracursos.starwars.modelos.PeliculaSWAPI;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConsultaApi {
    private int peliculaSW;
    private Pelicula peliculaEscribir;

    public Pelicula Consulta(int pelicula) {
        this.peliculaSW = pelicula;

        String urlApi = "https://swapi.dev/api/films/" + pelicula;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(urlApi)).build();

            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            String json = response.body();
            // System.out.println(json);

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            PeliculaSWAPI peliculaSWAPI = gson.fromJson(json, PeliculaSWAPI.class);
            Pelicula peliculaBuscada = new Pelicula(peliculaSWAPI);
            this.peliculaEscribir = peliculaBuscada;
            System.out.println(peliculaBuscada.toString());
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        } catch (ErrorNoExiste e) {
            System.out.println(e.getMessage());
        }
        return peliculaEscribir;
    }

    public void setPeliculaSW(int peliculaSW) {
        this.peliculaSW = peliculaSW;
    }

    public static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException excepcion) {
            return false;
        }

    }
}