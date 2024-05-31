package com.aluracursos.proyecto.modelos;

public class Podcast extends Audio{
    String canal;
    String descripcion;

    @Override
    public int getClasificacion() {
        if(getTotalDeReproducciones()>= 100)
        return 9;
        else
        return 2;
    }


    public String getCanal() {
        return canal;
    }
    public void setCanal(String canal) {
        this.canal = canal;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    

        
}
