

public class Principal {

    public static void main(String[] args) {

    Pelicula miPelicula = new Pelicula();

    miPelicula.nombre = "Encanto";
    miPelicula.fechaDeLanzamiento = 2023;
    miPelicula.duracionEnMinutos = 120;
    miPelicula.incluidoEnElPlan = true;

    miPelicula.muestraFichaTecnica();
    miPelicula.evaluar(7.8);
    miPelicula.evaluar(10.0);

        System.out.println(miPelicula.sumaDeLasEvaluaciones);

    Pelicula otraPelicula = new Pelicula();

    otraPelicula.nombre = "Matrix";
    otraPelicula.fechaDeLanzamiento = 1998;
    otraPelicula.duracionEnMinutos = 180;

    otraPelicula.muestraFichaTecnica();

    }

}
