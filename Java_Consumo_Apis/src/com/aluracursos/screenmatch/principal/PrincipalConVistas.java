package com.aluracursos.screenmatch.principal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

public class PrincipalConVistas {

    public static void main(String[] args) {
     
    Pelicula encanto = new Pelicula("Encanto", 2003);
    Serie got= new Serie("Juego de Tronos", 2000);
    Pelicula matrix = new Pelicula("Matrix", 1998);
    Serie lost = new Serie("Lost", 2000);

      List<Titulo> lista = new ArrayList<>();
        lista.add(encanto);
        encanto.evaluar(10);
        got.evaluar(6);
        matrix.evaluar(5);
        lost.evaluar(3);
        lista.add(matrix);
        lista.add(lost);
        lista.add(got);
        
        //Hacen referencia a la memoria del objeto inicial o espacio de memoria.
        System.out.println("Tamaño de la lista " + lista.size());
        // System.out.println("La primera pelicual es " + lista.get(0).getNombre());
        // System.out.println("La primera pelicual es " + lista);   

        for (Titulo item : lista) {
            //Verifica sí es de un tipo de objeto, sí es lo convierte en una variable llamada tal x. 
            if(item instanceof Pelicula pelicula && pelicula.getClasificacion() > 3){
                System.out.println(pelicula);
            }
        

            
        }

        ArrayList<String> listaDeArtistar = new ArrayList<>();
        listaDeArtistar.add("Penelope Cruz");
        listaDeArtistar.add("Antonio Banderas");
        listaDeArtistar.add("Ricardo Barin");
        System.out.println(listaDeArtistar);
        Collections.sort(listaDeArtistar);
        System.out.println("Lista De Artistar ordenadas " + listaDeArtistar);

        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada por fecha "+lista);
    }
}


/*
 * Ejemplo
 * 
ArrayList<String> nombres = new ArrayList<>();
nombres.add("Andrea");
nombres.add("Bruno");
nombres.add("Darío");
nombres.add("Emilia");

for (String nombre : nombres) {
    System.out.println(nombre);
}
//?Arrow function
nombres.forEach(nombre -> System.out.println(nombre));
//?Simplificado
nombres.forEach(System.out::println);


 * 
 * 
 * 
 */