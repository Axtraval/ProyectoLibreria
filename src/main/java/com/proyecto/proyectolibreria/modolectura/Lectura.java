package com.proyecto.proyectolibreria.modolectura;

public class Lectura extends Libro{
    public Lectura(String titulo, String autor, String genero, int precio, int anio){
        super(titulo, autor, genero, precio, anio);

    }

    public String mostrarcontenido(){
        return "mostrando contenido de "+titulo;
    }

    public String mostrarInfo(){return titulo+""+autor+""+genero;}


}
