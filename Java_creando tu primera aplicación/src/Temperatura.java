import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {
        System.out.print("Ingresa los grados Celcius a converir a Fahrenheit: ");
        Scanner scanner = new Scanner(System.in);
        double temperaturaEnCelcius = scanner.nextDouble();
        double temperaturaEnFahrenheit = (temperaturaEnCelcius * 1.8) + 32;
        System.out.println("La temperatura en Fahrenheits es: " + (int)temperaturaEnFahrenheit);
    }
}

//Escribe un programa que convierta una temperatura en grados Celsius a Fahrenheit.
// Utiliza variables para representar los valores de las temperaturas e imprime en la consola el valor convertido de Celsius a Fahrenheit.
//Consejo: La fórmula para convertir temperaturas de grados Celsius a Fahrenheit es: (temperatura * 1.8) + 32.