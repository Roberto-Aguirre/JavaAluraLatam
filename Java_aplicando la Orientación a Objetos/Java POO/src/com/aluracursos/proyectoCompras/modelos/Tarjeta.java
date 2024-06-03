package com.aluracursos.proyectoCompras.modelos;

import java.util.ArrayList;
import java.util.List;

public class Tarjeta {

    private double limiteCredito;
    private double saldo;
    public List<Compra> listaDeCompras;
    
    public Tarjeta(double limite) {
        this.limiteCredito = limite;
        this.saldo = limiteCredito;
        this.listaDeCompras = new ArrayList<>();
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getListaDeCompras() {
        return listaDeCompras;
    }

    public boolean realizarCompra(Compra compra){
        if(this.saldo>=compra.getValorCompra()){
            this.saldo -= compra.getValorCompra();
            this.listaDeCompras.add(compra);
            return true;
        }
        return false;
    }

}