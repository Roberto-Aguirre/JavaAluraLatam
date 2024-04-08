package Desafios;

import java.util.Random;
import java.util.Scanner;

public class Desafio2_Clase03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valorDeUsuario = 0;
        int numeroRandom = new Random().nextInt(100);
        ;
        int intentosUsuario = 1;
        System.out.println("""
                Bienvenido al Adivador JavaClass de Roberto.
                Te deseo suerte. Presiona un enter para empezar. 
                """);
//        System.out.println("Debug: " + numeroRandom);
        while (valorDeUsuario != numeroRandom) {
            System.out.print("Ingrea un valor entre el 1 y el 100: ");
            valorDeUsuario = teclado.nextInt();
            if (valorDeUsuario < numeroRandom) {
                System.out.println("El valor es mayor");
            } else if (valorDeUsuario > numeroRandom) {
                System.out.println("El valor es menor");
            } else {
                System.out.println("Felicidades por encontrar el valor.");
                System.out.println("Tu numero de intentos fueron: " + intentosUsuario);
            }
            intentosUsuario++;
        }


    }
}

/*
*
¡Ahora te toca a ti!

Practica los conceptos que se enseñaron durante esta clase con el siguiente desafío:

Crea un programa que simule un juego de adivinanzas. El programa debe generar un número aleatorio entre 0 y 100, y pedir al usuario que intente adivinar ese número en un máximo de 5 intentos. En cada intento, el programa debe informar si el número ingresado por el usuario es mayor o menor que el número generado.

Consejos:

Para generar un número aleatorio en Java: new Random().nextInt(100);

Utiliza el Scanner para obtener los datos del usuario.

Utiliza una variable para contar los intentos.

Utiliza un bucle para controlar los intentos.

Utiliza la instrucción ‘break;’ para salir del bucle.

¡Buena suerte!

*
* */