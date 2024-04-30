import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
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
        serie1.setTemporadas(1);
        serie1.setMinutosPorTemporada(50);
        serie1.setCapitulosPorTemporada(10);
        serie1.muestraFichaTecnica();

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        System.out.println(calculadora.getTiempoTotal());
        calculadora.incluye(serie1);
        System.out.println(calculadora.getTiempoTotal());
        
        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Matrix");;
        otraPelicula.setFechaDeLanzamiento(1998);
        otraPelicula.setDuracionEnMinutos(180);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo necesario para ver tus titulos favoritos: "+calculadora.getTiempoTotal()+" minutos");
        
        



    }

}
