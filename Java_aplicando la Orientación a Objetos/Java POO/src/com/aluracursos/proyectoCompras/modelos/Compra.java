package com.aluracursos.proyectoCompras.modelos;

public class Compra {
    private int valorCompra;
    private String descripcionCompra;

    public Compra(int valorCompra, String descripcionCompra) {
        this.valorCompra = valorCompra;
        this.descripcionCompra = descripcionCompra;
    }

    public int getValorCompra() {
        return valorCompra;
    }

    public String getDescripcionCompra() {
        return descripcionCompra;
    }
    
    @Override
    public String toString() {
        return this.descripcionCompra +" - $"+this.valorCompra;
    }
}
