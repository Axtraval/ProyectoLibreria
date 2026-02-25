package com.proyecto.Clases.UtilsDsh;

public class Libro_dsh {

    private int id;
    private String titulo;
    private int anio;
    private String autor;
    private String genero;
    private int puntos;

    public Libro_dsh(int id, String titulo, int anio, String autor, String genero, int puntos) {
        this.id = id;
        this.titulo = titulo;
        this.anio = anio;
        this.autor = autor;
        this.genero = genero;
        this.puntos = puntos;
    }

    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public int getAnio() { return anio; }
    public String getAutor() { return autor; }
    public String getGenero() { return genero; }
    public int getPuntos() { return puntos; }

    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setAnio(int anio) { this.anio = anio; }
    public void setAutor(String autor) { this.autor = autor; }
    public void setGenero(String genero) { this.genero = genero; }
    public void setPuntos(int puntos) { this.puntos = puntos; }
}