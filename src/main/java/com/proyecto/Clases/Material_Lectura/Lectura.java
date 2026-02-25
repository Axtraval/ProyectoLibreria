package com.proyecto.Clases.Material_Lectura;

public class Lectura extends Libro{
    public Lectura(String titulo, String autor, String genero, int precio, int anio){
        super(titulo, autor, genero, precio, anio);

    }

    @Override
    public String mostrarcontenido(){
        return "\nMostrando contenido de "+titulo+" \n\tHabia una vez...";
    }

    public String mostrarInfo(){return "\n"+titulo+" |Autor: "+autor+" |Genero: "+genero+MostrarPrecio()+mostrarcontenido()+"\n";}

    public String MostrarPrecio() {
        return " |El libro cuesta "+precio+" puntos|";}



}
