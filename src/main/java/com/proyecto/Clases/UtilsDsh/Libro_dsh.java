package com.proyecto.Clases.UtilsDsh;
import com.proyecto.Clases.Material_Lectura.Libro;

public class Libro_dsh extends Libro {
    private int id;
    public Libro_dsh(int id, String titulo, int anio, String autor, String genero, int precio) {
        super(titulo, autor, genero, precio, anio);
        this.id = id;

    }

    public int getId() { return id; }

    @Override
    public String mostrarInfo() {
        return "";
    }

    @Override
    public String MostrarPrecio() {
        return "";
    }

    @Override
    public String mostrarcontenido() {
        return "";
    }



}