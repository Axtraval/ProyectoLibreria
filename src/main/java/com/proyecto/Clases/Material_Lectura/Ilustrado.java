package com.proyecto.Clases.Material_Lectura;

public class Ilustrado extends Libro{
    boolean isAcolor=true;
    int frecuency=0;
    public Ilustrado(String titulo, String autor, String genero, int puntos, int anio, Boolean isAcolor, int frecuency){
        super(titulo, autor, genero, puntos, anio);
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
        if (!isAcolor){return " [no es a color]";}
        else return " [es a color]";
    }

    @Override

    public String mostrarInfo(){return "\n"+titulo+" |Autor: "+autor+" |Genero: "+genero+MostrarPrecio()+" "+frecuency()+Formato()+mostrarcontenido()+"\n";}


    public String MostrarPrecio() {
        return " |El libro cuesta "+puntos+" puntos|";
    }


    public String mostrarcontenido() {
        return "\nMostrando contenido de "+titulo+" \n\t[Image]..";
    }

    public String frecuency(){
        if(frecuency==1){
            return "La frecuencia de actualización es de "+frecuency+" vez por semana";
        } else return "La frecuencia de actualización es de "+frecuency+" veces por semana";
    }
}
