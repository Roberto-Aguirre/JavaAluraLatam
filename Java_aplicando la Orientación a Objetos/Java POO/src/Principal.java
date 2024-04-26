import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class Principal {

    public static void main(String[] args) {

    Pelicula miPelicula = new Pelicula();
    
    miPelicula.setNombre("Encanto");
    miPelicula.setFechaDeLanzamiento(2023);
    miPelicula.setDuracionEnMinutos(120);;
    miPelicula.setIncluidoEnElPlan(true);;

    miPelicula.muestraFichaTecnica();
    miPelicula.evaluar(6);
    miPelicula.evaluar(7.8);
    miPelicula.evaluar(10.0);

System.out.println("Média de evaluaciones de la película: " + miPelicula.calculaMedia());

        Serie serie1 = new Serie();

        serie1.setNombre("Juego de Tronos");
        serie1.setFechaDeLanzamiento(2000);
        serie1.setIncluidoEnElPlan(true);
        serie1.setTemporadas(10);
        serie1.setMinutosPorTemporada(50);
        serie1.setCapitulosPorTemporada(10);
        serie1.muestraFichaTecnica();
// Pelicula otraPelicula = new Pelicula();

    // otraPelicula.nombre = "Matrix";
    // otraPelicula.fechaDeLanzamiento = 1998;
    // otraPelicula.duracionEnMinutos = 180;

    // otraPelicula.muestraFichaTecnica();

    }

}
