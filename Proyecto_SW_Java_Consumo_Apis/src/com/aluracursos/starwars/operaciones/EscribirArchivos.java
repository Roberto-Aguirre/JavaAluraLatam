package com.aluracursos.starwars.operaciones;

import java.io.FileWriter;
import java.io.IOException;

import com.aluracursos.starwars.modelos.Pelicula;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EscribirArchivos {


    public void EscribirArchivo(Pelicula pelicula) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter filewriter = new FileWriter("StarWars.json");
        filewriter.write(gson.toJson(pelicula));
        filewriter.close();
    }
}
