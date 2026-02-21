package com.proyecto.proyectolibreria.Crudlect;

public class Libro {
    private int num;
    private String titulo;

    public Libro(int num, String titulo) {
        this.num = num;
        this.titulo = titulo;
    }

    public int getNum() { return num; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    @Override
    public String toString() {
        return "Número: " + num + " | Título: " + titulo;
    }
}
