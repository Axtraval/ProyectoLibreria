package com.proyecto.proyectolibreria.a;
import com.proyecto.proyectolibreria.modolectura.Ilustrado;
import com.proyecto.proyectolibreria.modolectura.Lectura;
import com.proyecto.proyectolibreria.modolectura.Libro;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Libro>libritos=new ArrayList<>();
        libritos.add(new Ilustrado("havana","camilo","fantasia",20,1990,false,1));
        libritos.add(new Lectura("bibiu","bollie","romance",15, 2005));
        for(Libro i : libritos){
            System.out.println("Mostrando contenido de "+i.getTitulo()+""+i.mostrarInfo());
        }



    }

}
