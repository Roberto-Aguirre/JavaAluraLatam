//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Bienvenido(a) a Screen Match");
        System.out.println("Pelicula: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2+6.0+9.0) / 3;
        System.out.println(media);

        String sinopsis = """
                Matriz es una paradoja
                La mejor pelicula del fin del milenio
                Fue lanzada en: 
                """+fechaDeLanzamiento;

        System.out.println(sinopsis);

        int clasificacion = (int)media/2;
        System.out.println(clasificacion);

//        double x = 10.5;
//        int y = (int) x;
//        System.out.println(y);

    }
}