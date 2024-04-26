package Proyecto;

import java.text.MessageFormat;
import java.util.Scanner;

public class Proyecto{

public static void main (String[]args){
    double saldo = 1599.99;
    double saldo_opcion ;
    int opcion = 0;
    Scanner teclado = new Scanner(System.in);
    var MENSAJE_SALDO = MessageFormat.format("""
        ************************************************
        
        Nombre del cliente:  Tony Stark
        Tipo de cuenta: Corriente
        Saldo disponible: {0}$
        
        ************************************************
        """,saldo);
    String MENSAJE_OPCIONES = """
        ** Escriba el numero de la opcion deseada **
        1 - Consultar saldo
        2 - Retirar 
        3 - Depositar
        9 - Salir
        """;
    String IN_OPCION = "> ";    
    
    //! OPCIONES DEL MENU
    //Opcion del menu 1 - Consultar
    //* Template strings de las opciones */
    //Opcion del menu 2 - Retirar
    String OPCION2_0 = "¿Cuál es el valor que deseas retirar?";
    String OPCION2_ERROR = "Saldo insuficiente";
    //Opcion del menu 3 - Depositar
    String OPCION3_0 = "¿Cuál es el valor que vas a depositar?";
    String FINISH = "Finalizado el programa. Muchas gracias por usar nuestros servicios";
    String ERROR = "Opcion no valida, intente de nuevo";
    
    //*Condiciones iniciales */
    System.out.print(MENSAJE_SALDO);
    System.out.print(MENSAJE_OPCIONES);
    System.out.print(IN_OPCION);
    opcion = teclado.nextInt();
    //* Empieza el bucle con switch */
    do {
        
        System.out.println();
        switch (opcion) {
            case 1:
                    var OPCION1 = MessageFormat.format("El saldo actualizado es: {0} $",saldo);
                    System.out.println(OPCION1);
                break;
            
            case 2:
                    System.out.println(OPCION2_0);
                    saldo_opcion = teclado.nextDouble();
                    if(saldo_opcion<saldo){
                        saldo -= saldo_opcion;    
                        var OPCION2_OK = MessageFormat.format("Saldo restante {0} $",saldo);
                        System.out.println(OPCION2_OK);}
                        else{System.out.println(OPCION2_ERROR);}

                break;

            case 3:

                    System.out.println(OPCION3_0);
                    saldo_opcion = teclado.nextDouble();
                    saldo += saldo_opcion;
                    String OPCION3_OK = MessageFormat.format("El saldo actualizado es: {0} $",saldo);;
                    System.out.println(OPCION3_OK);        
                break;
            default:
                    System.out.println(ERROR);
                break;
                }
                System.out.print(MENSAJE_OPCIONES);
                System.out.print(IN_OPCION);
                opcion = teclado.nextInt();
                
            } while (opcion!=9);
        System.out.println(FINISH);

}


}
