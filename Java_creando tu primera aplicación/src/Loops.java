import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;
        for (int i = 0; i<10;i++){
            System.out.print("Escribe la nota que le darias a la pelicula Matrix: ");
            nota = teclado.nextDouble();
            mediaEvaluaciones = mediaEvaluaciones + nota;
        }
        System.out.println("Media de: "+(mediaEvaluaciones/3));
    }
}
