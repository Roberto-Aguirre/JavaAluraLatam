package com.proyecto.modelos;

public class Audio {
    private String titulo;
    private int duracion;
    private int totalDeReproducciones;
    private int meGustas;
    private int clasificacion;
    private int annoLanzamiento;


    public int getAnnoLanzamiento() {
        return annoLanzamiento;
    }

    public void setAnnoLanzamiento(int annoLanzamiento) {
        this.annoLanzamiento = annoLanzamiento;
    }

    public String getTitulo(){
        return titulo;
    }

    public int getDuracion(){
        return duracion;
    }

    public int getTotalDeReproducciones(){
        return totalDeReproducciones;
    }

    public int getMeGustas(){
        return meGustas;
    }

    public int getClasificacion(){
        return clasificacion;
    }

    public void setTitutlo(String titulo){
        this.titulo = titulo;
    }

    public void setDurarcion(int duracion){
        this.duracion = duracion;        
    }
    
    public void setTotalDeReproducciones(int totalDeReproducciones){
        this.totalDeReproducciones = totalDeReproducciones;
    }

    public void setMeGustas(int meGustas){
        this.meGustas = meGustas;
    }

    public void setClasificacion(int clasificacion){
        this.clasificacion = clasificacion;
    }

    public void DarMeGusta(){
        meGustas++;
    }
    
    public void Reproducir(){
        System.out.println("Musica");
    }

}
