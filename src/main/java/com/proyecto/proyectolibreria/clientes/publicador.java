package com.proyecto.proyectolibreria.clientes;

public class publicador extends cliente{
    String bestSeller;
    int cantidadPublicaciones;

    public publicador(String username, String correo, int edad, String bestSeller, int cantidadPublicaciones) {
        super(username, correo, edad);
        this.bestSeller = bestSeller;
        this.cantidadPublicaciones = cantidadPublicaciones;
    }
}
