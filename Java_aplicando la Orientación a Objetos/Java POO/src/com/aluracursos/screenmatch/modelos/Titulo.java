package com.aluracursos.screenmatch.modelos;

public class Titulo implements Comparable<Titulo>{
  
    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;

    private double sumaDeLasEvaluaciones;
    private int totalDeLasEvaluaciones;


    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setFechaDeLanzamiento(int fechaDeLanzamiento){
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }
    public int getFechaDeLanzamiento(){
        return fechaDeLanzamiento;
    }
    public void setDuracionEnMinutos(int duracionEnMinutos){
        this.duracionEnMinutos = duracionEnMinutos;
    }
    public int getDuracionEnMinutos(){
        return duracionEnMinutos;
    }
    public void setIncluidoEnElPlan(boolean incluidoEnElPlan){
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public boolean getIncluidoEnElPlan(){
        return incluidoEnElPlan;
    }

    public int getTotalDeLasEvaluaciones(){
        return totalDeLasEvaluaciones;
    }
    public void muestraFichaTecnica(){
        System.out.println("El nombre de la pelicula es : " + getNombre());
        System.out.println("Su fecha de lanzamiento es : "+ getFechaDeLanzamiento());
        System.out.println("Duracion en minutos : " + getDuracionEnMinutos());
    }
    public void evaluar(double nota){
            sumaDeLasEvaluaciones += nota;
            totalDeLasEvaluaciones++;
    }
    public double calculaMedia(){

        return sumaDeLasEvaluaciones/totalDeLasEvaluaciones;  
    }

    @Override
    public String toString() {
        
        return this.getNombre()+ " ("+this.fechaDeLanzamiento+")";
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }
    
}
