import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;
        int contador = 0;
        while(contador<3){
            System.out.print("Escribe la nota que le darias a la pelicula Matrix: ");
            if(nota!=-1) {
                nota = teclado.nextDouble();
                mediaEvaluaciones += nota;
            }
            contador++;
        }
        System.out.println("Media de: "+(mediaEvaluaciones/3));

    }

}
