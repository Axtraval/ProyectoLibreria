package com.proyecto.proyectolibreria.model.clientes;

public class lector extends cliente{
    int puntaje;
    int cantidadDeLibrosLeidos;
    int librosFavoritos;

    public lector(String username, String correo, int edad, int puntaje, int cantidadDeLibrosLeidos, int librosFavoritos) {
        super(username, correo, edad);
        this.puntaje = puntaje;
        this.cantidadDeLibrosLeidos=cantidadDeLibrosLeidos;
        this.librosFavoritos=librosFavoritos;


    }
}
