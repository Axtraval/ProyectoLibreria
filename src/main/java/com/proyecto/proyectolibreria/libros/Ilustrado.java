package com.proyecto.proyectolibreria.libros;

import java.util.ArrayList;

public class Ilustrado extends Libro {

    ArrayList<Ilustrado> listaIlustrado = new ArrayList<>();

    public Ilustrado(String titulo, String autor, String genero, int precio, int anio) {
        super(titulo, autor, genero, precio, anio);


        listaIlustrado.add(new Ilustrado("El Hobbit (Edicion Ilustrada)", "J.R.R. Tolkien", "Fantasia", 1000, 1937));

        listaIlustrado.add(new Ilustrado("Harry Potter Y La Piedra Filosofal (Edicion Ilustrada)", "J.K. Rowling", "Fantasia", 900, 1997));

        listaIlustrado.add(new Ilustrado("El Principe Cruel (Edicion Ilustrada)", "Holly Black", "Fantasia", 700, 2018));

        listaIlustrado.add(new Ilustrado("Star Wars Archives (Edicion Ilustrada)", "Paul Duncan", "Ciencia Ficcion", 600, 2020));

        listaIlustrado.add(new Ilustrado("Ready Player One (Edicion Ilustrada)", "Ernest Cline", "Ciencia Ficcion", 750, 2011));

        listaIlustrado.add(new Ilustrado("Atlas del Futuro (Edicion Ilustrada)", "Chris Wormell", "Ciencia Ficcion", 950, 2023));

        listaIlustrado.add(new Ilustrado("Sherlock Holmes (Edicion Ilustrada)", "Arthur Conan Doyle", "Misterio", 650, 1887));

        listaIlustrado.add(new Ilustrado("Nancy Drew", "Carolyn Keene", "Misterio", 600, 1930));

        listaIlustrado.add(new Ilustrado("El Libro DeLa Selva", "Rudyard Kipling", "Aventura", 500, 1894));

        listaIlustrado.add(new Ilustrado("La Dama y el Vagabundo (Ilustrado)", "Disney", "Romance", 550, 1955));

        listaIlustrado.add(new Ilustrado("Orgullo y Prejuicio (Ilustrado)", "Jane Austen", "Romance", 700, 1813));

        listaIlustrado.add(new Ilustrado("Romeo y Julieta (Edicion Grafica)", "William Shakespeare", "Romance", 800, 1597));

        listaIlustrado.add(new Ilustrado("Coraline (Novela Grafica)", "Neil Gaiman", "Terror", 750, 2002));

        listaIlustrado.add(new Ilustrado("El Gato Negro (Edicion Ilustrada)", "Edgar Allan Poe", "Terror", 650, 1843));

        listaIlustrado.add(new Ilustrado("It (Edicion Ilustrada)", "Stephen King", "Terror", 1200, 1986));
    }
}

