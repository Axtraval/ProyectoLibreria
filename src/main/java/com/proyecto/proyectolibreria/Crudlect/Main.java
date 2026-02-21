package com.proyecto.proyectolibreria.Crudlect;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Libro> biblioteca = new ArrayList<>();
        Scanner leer = new Scanner(System.in);
        int opcion, contadorNum = 1;

        do {
            System.out.println("\n--- SISTEMA PUBLICADOR ---");
            System.out.println("1. Publicar libro: ");
            System.out.println("2. Lista de libros;");
            System.out.println("3. Modificar publicación: ");
            System.out.println("4. Eliminar publicación: ");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = leer.nextInt();
            leer.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del libro: ");
                    String titulo = leer.nextLine();
                    biblioteca.add(new Libro(contadorNum++, titulo));
                    System.out.println("¡Publicado con éxito!");
                    break;

                case 2:
                    System.out.println("--- Lista de Libros ---");
                    for (Libro l : biblioteca) System.out.println(l);
                    break;

                case 3:
                    System.out.print("Número del libro a modificar: ");
                    int numMod = leer.nextInt();
                    leer.nextLine();
                    for (Libro l : biblioteca) {
                        if (l.getNum() == numMod) {
                            System.out.print("Nuevo título: ");
                            l.setTitulo(leer.nextLine());
                        }
                    }
                    break;

                case 4:
                    System.out.print("Número del libro a eliminar: ");
                    int numDel = leer.nextInt();
                    biblioteca.removeIf(l -> l.getNum() == numDel);
                    System.out.println("Eliminado.");
                    break;
            }
        } while (opcion != 5);
    }
}
