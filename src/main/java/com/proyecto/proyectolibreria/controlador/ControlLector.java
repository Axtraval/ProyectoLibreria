package com.proyecto.proyectolibreria.controlador;
import com.proyecto.proyectolibreria.basedatos.BasedeDatos;
import com.proyecto.proyectolibreria.Crudlect.Lector;

public class ControlLector {
    public void crearLector(String id, String correo,int edad){
        Lector lector = new Lector(id, correo,edad);
        BasedeDatos.lectores.add(lector);
    }

    public Lector buscalect(String id){
        for (int i = 0; i<BasedeDatos.lectores.size(); i++){
            if (BasedeDatos.lectores.get(i).getId().equals(id)){
                return BasedeDatos.lectores.get(i);
            }
        }
        return null;
    }

    public boolean updCorreo(String id,String nuevoCorreo){
        Lector lector = buscalect(id);
        if (lector != null){
            lector.setCorreo(nuevoCorreo);
            return true;
        }
        return false;
    }

    public boolean delLector(String id){
        Lector lector = buscalect(id);
        if (lector != null){
            BasedeDatos.lectores.remove(lector);
            return true;
        }
        return false;
    }









}
