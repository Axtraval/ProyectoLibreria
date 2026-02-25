package com.proyecto.Clases.Clientes;

public class Publicador extends Cliente {
    String bestSeller;
    int cantidadPublicaciones;

    public Publicador(String username, String correo, int edad, String bestSeller, int cantidadPublicaciones) {
        super(username, correo, edad);
        this.bestSeller = bestSeller;
        this.cantidadPublicaciones = cantidadPublicaciones;
    }
}
