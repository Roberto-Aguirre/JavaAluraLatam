package com.aluracursos.proyectoCompras.modelos;

public class Compra {
    private double valorCompra;
    private String descripcionCompra;

    public Compra(double valorCompra, String descripcionCompra) {
        this.valorCompra = valorCompra;
        this.descripcionCompra = descripcionCompra;
    }

    public double getValorCompra() {
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
