package com.aluracursos.proyectoCompras.principal;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.aluracursos.screenmatch.modelos.Titulo;

public class PrincipalCompras {
    public static void main(String[] args) {
        //*Seccion de Textos */
        String textoLimite = "Escriba el limite de la tarjeta: ";
        String textoDescripcion = "Escriba la descripcion de la compra: ";
        String textoValor = "Digite el valor de su compra: ";
        String textoCompraRealizada = "Compra realizada correctamente";
        String textoCompraError = "Saldo insuficiente";
        String textoOpcion = "Escriba: 0 para salir | 1 para continuar";
        String textoOpcionError = "Digite un valor correcto";
        /**Seccion variables del sistema */
        int opcion = 1;
        int valorLimite, valorCompra;
        String valorDescripcion;
        
        Map<String, Integer> listaCompras = new HashMap<>();
        Scanner input = new Scanner(System.in);

        System.out.println(textoLimite);
        valorLimite = input.nextInt();
        while (opcion != 0) {
            if (opcion == 1) {
                
                System.out.println("\n"+textoDescripcion);
                valorDescripcion = input.next();
                System.out.println(textoValor);
                valorCompra = input.nextInt();
                if (valorCompra < valorLimite) {
                    System.out.println(valorLimite);
                    listaCompras.put(valorDescripcion,valorCompra);
                    valorLimite -= valorCompra;
                    // System.out.println(valorLimite);
                    System.out.println(textoCompraRealizada);
                    System.out.println(textoOpcion);
                    opcion = input.nextInt();
                }
                else {
                    System.out.println(textoCompraError);
                    break;
                }
                
            } else {
                System.out.println(textoOpcionError);
                break;
            }
        }
        
        System.out.println("\n*************************");
        System.out.println("COMPRAS REALIZADAS");
        listaCompras.forEach((t, u) -> System.out.println(t +" "+ u) );

        System.out.println("*************************");
        System.out.println("Saldo de la tarjeta: "+ valorLimite);


    }

}
