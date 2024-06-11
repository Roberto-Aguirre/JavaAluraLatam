package com.aluracursos.screenmatch.principal;

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

import com.aluracursos.screenmatch.excepciones.ErrorEnConversionDeDuracionException;
import com.aluracursos.screenmatch.modelos.Titulo;
import com.aluracursos.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PrincipalConBusqueda {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        List <Titulo> listaDePeliculas = new ArrayList<>();
         while (true) {
            
            
            System.out.println("Ingrese la pelicula a buscar: ");
            //*La concatenación de la dirección de la API con el parámetro busqueda no se realizó correctamente. */
            var peliculaUsuario = input.nextLine();
            if (peliculaUsuario.equals("salir")) {
               break;
            }
            
        String apikey = "57bedfc9";
        String peliculaPeticion = "http://www.omdbapi.com/?t="+peliculaUsuario.replace(" ", "+")+"&apikey="+apikey;
    
        try {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(peliculaPeticion))
                .build();
        //* El método send debe llamarse desde el objeto client y no desde el objeto request.
         HttpResponse<String> response = client.send(request, BodyHandlers.ofString()); 
        String json = response.body();
         System.out.println(json);
        
         Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();
         TituloOmdb miTituloOmbd = gson.fromJson(json,TituloOmdb.class);
         Titulo miTitulo = new Titulo(miTituloOmbd);
            System.out.println("Titulo: "+ miTitulo.toString());
            listaDePeliculas.add(miTitulo);


            // FileWriter escritura = new FileWriter("peliculas.txt");
            // escritura.write(miTitulo.toString());
            // escritura.close();

         } catch (NumberFormatException e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
         }catch (IllegalArgumentException e){
            System.out.println("Error en entrada de URI, verificar direccion");
         }catch (ErrorEnConversionDeDuracionException e){
            System.out.println(e.getMessage());
         }
         catch(Exception e){
            System.out.println("Ocurrio un error inesperado");
         }
         
        
    }

    Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

    System.out.println(listaDePeliculas);
    FileWriter escribirTxt = new FileWriter("Peliculas.json");
    escribirTxt.write(gson.toJson(listaDePeliculas));
    escribirTxt.close();
    System.out.println("Finalizo la ejecucion del programa");

   }


   


}

/* Metodo para varias excepciones y dar una misma salida.
 try {
    metodoQuePuedeLanzarUnaExcepcion();
} catch (NullPointerException | IllegalArgumentException e) {
    System.out.println("tratando error...");
}

 * 
 */

 /*Filereader

 File file = new File("C:\\miArchivo.txt");
FileReader reader = new FileReader(file);

int data = reader.read();
while (data != -1) {
    System.out.print((char) data);
    data = reader.read();
}
reader.close();
 

  */