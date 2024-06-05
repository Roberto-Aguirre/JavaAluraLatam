package com.aluracursos.screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

import com.aluracursos.screenmatch.modelos.Titulo;
import com.aluracursos.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PrincipalConBusqueda {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la pelicula a buscar: ");
        //*La concatenación de la dirección de la API con el parámetro busqueda no se realizó correctamente. */
        var peliculaUsuario = input.nextLine();
    
        String apikey = "57bedfc9";
        String peliculaPeticion = "http://www.omdbapi.com/?t="+peliculaUsuario+"&apikey="+apikey;
    
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(peliculaPeticion))
                .build();
        //* El método send debe llamarse desde el objeto client y no desde el objeto request.
         HttpResponse<String> response = client.send(request, BodyHandlers.ofString()); 
        String json = response.body();
         System.out.println(json);
        
         Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
         TituloOmdb miTituloOmbd = gson.fromJson(json,TituloOmdb.class);
         try {
            Titulo miTitulo = new Titulo(miTituloOmbd);
            System.out.println("Titulo: "+ miTitulo.toString());
         } catch (NumberFormatException e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
         }finally{
            System.out.println("Finalizo la ejecucion del programa");
         }
         
    }
}
