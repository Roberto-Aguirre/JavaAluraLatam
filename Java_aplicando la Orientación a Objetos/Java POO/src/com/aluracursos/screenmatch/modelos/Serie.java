package com.aluracursos.screenmatch.modelos;

public class Serie extends Titulo {
    int temporadas;
    int capitulosPorTemporada;
    int minutosPorEpisodio;
    

    @Override
    public int getDuracionEnMinutos(){
        return temporadas*capitulosPorTemporada*minutosPorEpisodio;
    }


    public int getTemporadas(){
        return temporadas;
    }

    public void setTemporadas(int temporadas){
        this.temporadas = temporadas;
    }

    public int getCapitulosPorTemporada(){
        return capitulosPorTemporada;
    }

    public void setCapitulosPorTemporada(int capitulosPorTemporada){
        this.capitulosPorTemporada = capitulosPorTemporada;
    }

    public int getMinutosPorEpisodio(){
        return minutosPorEpisodio;
    }
    public void setMinutosPorTemporada(int minutosPorEpisodio){
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    


}
