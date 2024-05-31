package com.aluracursos.proyecto.modelos;

public class MisFavoritos {

public void adicionar(Audio audio){
    if(audio.getClasificacion() >= 7 ){
        System.out.println(audio.getTitulo()+ " Es uno de los favoritos del momento.");
    }else{
        System.out.println(audio.getTitulo()+ " No se encuentra tan valorado.");
    }

}
    

}