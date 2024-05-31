package com.aluracursos.screenmatch;

import java.util.ArrayList;

import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class Principal {

    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Encanto",2003);

        miPelicula.setDuracionEnMinutos(120);
        ;
        miPelicula.setIncluidoEnElPlan(true);
        ;

        miPelicula.muestraFichaTecnica();
        miPelicula.evaluar(10.0);

        System.out.println("Média de evaluaciones de la película: " + miPelicula.calculaMedia());

        Serie serie1 = new Serie("Juego de Tronos",2000);
        serie1.setIncluidoEnElPlan(true);
        serie1.setTemporadas(1);
        serie1.setMinutosPorTemporada(50);
        serie1.setCapitulosPorTemporada(10);
        serie1.muestraFichaTecnica();

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        System.out.println(calculadora.getTiempoTotal());
        calculadora.incluye(serie1);
        System.out.println(calculadora.getTiempoTotal());

        Pelicula otraPelicula = new Pelicula("Matrix",1998);
        otraPelicula.setDuracionEnMinutos(180);
        calculadora.incluye(otraPelicula);
        System.out.println(
                "Tiempo necesario para ver tus titulos favoritos: " + calculadora.getTiempoTotal() + " minutos");

        FiltroRecomendacion recomendacion = new FiltroRecomendacion();
        recomendacion.filtro(miPelicula);

        Episodio episodio = new Episodio();

        episodio.setNumero(1);
        episodio.setNombre("La casa Dragon");

        recomendacion.filtro(episodio);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);

        System.out.println("Tamaño de la lista " + listaDePeliculas.size());
        System.out.println("La primera pelicual es " + listaDePeliculas.get(0).getNombre());
        System.out.println("La primera pelicual es " + listaDePeliculas);
        //! Generar un array en el cual sean 5 maximo de extension.
        //* int[] numeros = new int[5];

    }

}
