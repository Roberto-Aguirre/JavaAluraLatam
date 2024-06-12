package com.aluracursos.starwars.principal;

import java.io.IOException;

import java.util.Scanner;

import com.aluracursos.starwars.operaciones.ConsultaApi;
import com.aluracursos.starwars.operaciones.EscribirArchivos;

public class Principal {

    public static void main(String[] args) throws IOException {
        Scanner inputTeclado = new Scanner(System.in);
        ConsultaApi callApi = new ConsultaApi();
        EscribirArchivos write = new EscribirArchivos();
        while (true) {
        System.out.println("""
        Ingrese un valor entero del capitulo de Star Wars a buscar.
        Nota: Se encuentran por ordenadas por fecha de salida.
        """);
        System.out.print(">");
        var peliculaBuscar = inputTeclado.nextLine();

        if (peliculaBuscar.equals("salir")) {
        break;    
        }else if(callApi.isNumeric(peliculaBuscar)){

            
           write.EscribirArchivo(callApi.Consulta(Integer.parseInt(peliculaBuscar))); 
        }
        else{
            System.out.println("Valor incompatible\n");
        }
        


    }
    
    }

}
