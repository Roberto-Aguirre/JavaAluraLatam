package com.proyecto.principal;

import com.proyecto.modelos.Canciones;
import com.proyecto.modelos.MisFavoritos;
import com.proyecto.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        
        Canciones miCancion = new Canciones();
        miCancion.setTitulo("Lovefool");
        miCancion.setAutor("The Cardigans");

        Podcast miPodcast = new Podcast();
        miPodcast.setTitulo("El podcast Alura");
        miPodcast.setCanal("RIAS");
        
        for (int i = 0; i < 500; i++) {
            miCancion.DarMeGusta();   
            miPodcast.DarMeGusta(); 
        }
        for (int i = 0; i < 1000; i++) {
            miPodcast.Reproducciones();
            miCancion.Reproducciones();    

        }
        miPodcast.getClasificacion();
        
        System.out.println(miCancion.getTitulo()+"\nTotal repoducciones: "+miCancion.getTotalDeReproducciones());
        System.out.println("Total me gustas: " + miCancion.getTotalMeGustas());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adicionar(miPodcast);
        favoritos.adicionar(miCancion);
    }
}
