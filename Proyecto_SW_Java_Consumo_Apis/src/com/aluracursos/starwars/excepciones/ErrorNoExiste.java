package com.aluracursos.starwars.excepciones;

public class ErrorNoExiste extends RuntimeException{
    private String mensaje;

    public ErrorNoExiste(String mensaje){
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        return this.mensaje+"\n";
    }
}
