package com.proyecto.Controllers.Crud_Lectura;

import com.proyecto.Clases.UtilsDsh.Libro_dsh;

import java.util.ArrayList;

public class Funciones_Logica {

    private static ArrayList<Libro_dsh> biblioteca = new ArrayList<>();
    private static int contadorId = 1;

    public void publicar(String titulo, int anio, String autor, String genero, int puntos) {
        biblioteca.add(new Libro_dsh(contadorId++, titulo, anio, autor, genero, puntos));
    }

    public ArrayList<Libro_dsh> listar() {
        return biblioteca;
    }

    public void modificar(int id, String titulo, int anio, String autor, String genero, int puntos) {
        for (Libro_dsh l : biblioteca) {
            if (l.getId() == id) {
                l.setTitulo(titulo);
                l.setAnio(anio);
                l.setAutor(autor);
                l.setGenero(genero);
                l.setPuntos(puntos);
                break;
            }
        }
    }

    public void eliminar(int id) {
        biblioteca.removeIf(l -> l.getId() == id);
    }
}