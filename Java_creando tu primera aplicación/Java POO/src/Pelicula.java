public class Pelicula {
    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    double sumaDeLasEvaluaciones;

    void muestraFichaTecnica(){
        System.out.println("El nombre de la pelicula es : " + nombre);
        System.out.println("Su fecha de lanzamiento es : "+ fechaDeLanzamiento);
        System.out.println("Duracion en minutos : " + duracionEnMinutos);
    }

    void evaluar(Double nota){
        sumaDeLasEvaluaciones += nota;

    }

}
