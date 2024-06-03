package com.aluracursos.proyectoCompras.principal;

import java.util.Comparator;
import java.util.Scanner;

import com.aluracursos.proyectoCompras.modelos.Compra;
import com.aluracursos.proyectoCompras.modelos.Tarjeta;

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
        
        Scanner input = new Scanner(System.in);

        System.out.println(textoLimite);
        Tarjeta tdc = new Tarjeta(input.nextInt());
        while (opcion != 0) {
            if (opcion == 1) {
                
                System.out.println("\n"+textoDescripcion);
                String valorDescripcion = input.next();
                System.out.println(textoValor);
                int valorCompra = input.nextInt();
                Compra compra = new Compra(valorCompra, valorDescripcion);
                if (tdc.getSaldo() >= compra.getValorCompra()) {
                    tdc.realizarCompra(compra);
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
        
        tdc.listaDeCompras.sort(Comparator.comparing(Compra::getValorCompra));
        System.out.println("\n*************************");
        System.out.println("COMPRAS REALIZADAS");
        tdc.listaDeCompras.forEach((element)->System.out.println(element.toString()));

        System.out.println("*************************");
        System.out.println("Saldo de la tarjeta: "+ tdc.getSaldo());


    }

}
