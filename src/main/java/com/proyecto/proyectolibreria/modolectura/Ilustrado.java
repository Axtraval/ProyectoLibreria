package com.proyecto.proyectolibreria.modolectura;

public class Ilustrado extends Libro{
    boolean isAcolor=true;
    int frecuency=0;
    public Ilustrado(String titulo, String autor, String genero, int precio, int anio, Boolean isAcolor, int frecuency){
        super(titulo, autor, genero, precio, anio);
        this.isAcolor = isAcolor;
        this.frecuency = frecuency;
    }

    public boolean isAcolor() {
        return isAcolor;
    }

    public void setImgVisualized(boolean isAcolor) {
        this.isAcolor = isAcolor;
    }

    public String Formato(){
        if (!isAcolor){return "no es a color";}
        else return "es a color";
    }

    @Override
    public String mostrarInfo(){return titulo+""+precio+""+isAcolor+frecuency()+Formato();}
    public String frecuency(){
        return "La frecuencia de actualización es de "+frecuency+" veces por semana";
    }
}
