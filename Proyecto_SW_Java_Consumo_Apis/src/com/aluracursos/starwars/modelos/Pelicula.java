package com.aluracursos.starwars.modelos;

import java.util.Date;

import com.aluracursos.starwars.excepciones.ErrorNoExiste;

public class Pelicula {
    private String titulo;
    private String director;
    private String fechaEstreno;
    private int noEpisodio;

    public Pelicula(String titulo, String director, String fechaEstreno, int noEpisodio) {
        this.titulo = titulo;
        this.director = director;
        this.fechaEstreno = fechaEstreno;
        this.noEpisodio = noEpisodio;
    }

    public Pelicula(PeliculaSWAPI pelicula) {
        if (pelicula.title() == null) {
            throw new ErrorNoExiste("Pelicula no existe");
        }
        this.titulo = pelicula.title();
        this.director = pelicula.director();
        this.fechaEstreno = pelicula.release_date();
        this.noEpisodio = pelicula.episode_id();
        // No se hace parse Int a pelicula.episodio_id por que llega como int
    }

    @Override
    public String toString() {
        return "Episodio: " + noEpisodio + " | " + titulo + " (" + fechaEstreno + ")\n";
    }

}
