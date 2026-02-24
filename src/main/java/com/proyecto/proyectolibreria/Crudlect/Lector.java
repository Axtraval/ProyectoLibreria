package com.proyecto.proyectolibreria.Crudlect;
import java.util.ArrayList;

public class Lector {
    private String id;
    private String correo;
    private int edad;
    private int puntaje;
    private int librosLeidos;
    private ArrayList<Libro> librosFavoritos;

    public Lector(String id, String correo, int edad){
        this.id= id;
        this.correo = correo;
        this.edad = edad;
        this.puntaje = 0;
        this.librosLeidos = 0;
        this.librosFavoritos = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getCorreo() {
        return correo;
    }

    public int getEdad() {
        return edad;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public int getLibrosLeidos() {
        return librosLeidos;
    }

    public ArrayList<Libro> getLibrosFavoritos() {
        return librosFavoritos;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public void agregaLibFav(Libro libro){
        librosFavoritos.add(libro);
    }

    public void borralibfav(Libro libro){
        librosFavoritos.remove(libro);
    }
}
