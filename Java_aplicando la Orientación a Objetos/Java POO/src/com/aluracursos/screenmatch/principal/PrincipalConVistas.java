package com.aluracursos.screenmatch.principal;
import java.util.ArrayList;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

public class PrincipalConVistas {

    public static void main(String[] args) {
     
    Pelicula encanto = new Pelicula("Encanto", 2003);
    Serie got= new Serie("Juego de Tronos", 2000);
    Pelicula matrix = new Pelicula("Matrix", 1998);
    Serie lost = new Serie("Lost", 2000);

      ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(encanto);
        encanto.evaluar(10);
        got.evaluar(6);
        matrix.evaluar(5);
        lost.evaluar(3);
        lista.add(matrix);
        lista.add(lost);
        lista.add(got);
        
        System.out.println("Tamaño de la lista " + lista.size());
        System.out.println("La primera pelicual es " + lista.get(0).getNombre());
        System.out.println("La primera pelicual es " + lista);   

        for (Titulo item : lista) {
            System.out.println(item);
            Pelicula pelicula = (Pelicula) item;
            System.out.println(pelicula.getClasificacion());
        }
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