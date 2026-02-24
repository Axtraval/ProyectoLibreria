package com.proyecto.Clases.Clientes;

public class Lector extends Cliente {
    int puntaje;
    int cantidadDeLibrosLeidos;
    int librosFavoritos;

    public Lector(String username, String correo, int edad, int puntaje, int cantidadDeLibrosLeidos, int librosFavoritos) {
        super(username, correo, edad);
        this.puntaje = puntaje;
        this.cantidadDeLibrosLeidos=cantidadDeLibrosLeidos;
        this.librosFavoritos=librosFavoritos;


    }
}
