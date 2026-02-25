package com.proyecto.Clases.UtilsDsh;

public class Libro_dsh {

    private int id;
    private String titulo;

    public Libro_dsh(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
