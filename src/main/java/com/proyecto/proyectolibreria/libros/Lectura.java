package com.proyecto.proyectolibreria.libros;

import java.util.ArrayList;

public class Lectura extends Libro{
        ArrayList<Lectura> listaLecturas = new ArrayList<>();


        public Lectura(String titulo, String autor, String genero, int precio, int anio){
            super(titulo, autor, genero, precio, anio);

            listaLecturas.add(new Lectura("El Nombre del Viento", "Patrick Rothfuss", "Fantasia", 700, 2007));

            listaLecturas.add(new Lectura("La Quinta Estacion", "N.K. Jemisin", "Fantasia", 650, 2015));

            listaLecturas.add(new Lectura("El Temor de un Hombre Sabio", "Patrick Rothfuss", "Fantasia", 750, 2011));

            listaLecturas.add(new Lectura("Dune", "Frank Herbert", "Ciencia Ficcion", 850, 1965));

            listaLecturas.add(new Lectura("Neuromante", "William Gibson", "Ciencia Ficcion", 600, 1984));

            listaLecturas.add(new Lectura("Fundacion", "Isaac Asimov", "Ciencia Ficcion", 700, 1951));

            listaLecturas.add(new Lectura("El Codigo Da Vinci", "Dan Brown", "Misterio", 650, 2003));

            listaLecturas.add(new Lectura("La Chica del Tren", "Paula Hawkins", "Misterio", 600, 2015));

            listaLecturas.add(new Lectura("Asesinato en el Orient Express", "Agatha Christie", "Misterio", 550, 1934));

            listaLecturas.add(new Lectura("Bajo la Misma Estrella", "John Green", "Romance", 500, 2012));

            listaLecturas.add(new Lectura("El Cuaderno de Noah", "Nicholas Sparks", "Romance", 550, 1996));

            listaLecturas.add(new Lectura("Orgullo y Prejuicio", "Jane Austen", "Romance", 450, 1813));

            listaLecturas.add(new Lectura("It", "Stephen King", "Terror", 1100, 1986));

            listaLecturas.add(new Lectura("El Exorcista", "William Peter Blatty", "Terror", 800, 1971));

            listaLecturas.add(new Lectura("Cementerio de Animales", "Stephen King", "Terror", 900, 1983));

        }
}
