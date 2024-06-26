package com.aluracursos.proyecto.modelos;

public class Canciones extends Audio{
    
    private String album;
    private String autor;
    private String genero;
    @Override
    public int getClasificacion() {
        if(getTotalMeGustas()>300)
            return 8;
            else
            return 4;
    }

    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

}
