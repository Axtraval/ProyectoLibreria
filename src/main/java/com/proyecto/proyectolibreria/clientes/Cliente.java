package com.proyecto.proyectolibreria.clientes;

public abstract class Cliente {
    String username;
    String correo;
    int edad;

    public Cliente(String username, String correo, int edad ){
        this.username = username;
        this.correo = correo;
        this.edad = edad;
    }

    public String getUsername(){
        return username;
    }

}
