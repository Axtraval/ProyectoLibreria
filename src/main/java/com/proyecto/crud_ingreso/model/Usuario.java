package com.proyecto.crud_ingreso.model;

public class Usuario {

    private String id;
    private String contrasena;
    private int puntos;

    public Usuario(String id, String contrasena, int puntos) {
        this.id = id;
        this.contrasena = contrasena;
        this.puntos = puntos;
    }

    public String getId() {
        return id;
    }

    public String getContrasena() {
        return contrasena;
    }

    public int getPuntos() {
        return puntos;
    }
}