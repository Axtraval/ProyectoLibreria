package com.proyecto.proyectolibreria.modolectura;

public class Libro {

        String autor;
        int anio;
        String genero;
        String titulo;
        int precio;

        public Libro(String titulo,String autor, String genero, int precio, int anio){
            this.titulo = titulo;
            this.autor = autor;
            this.genero = genero;
            this.precio = precio;
            this.anio = anio;
        }

        public int getAnio() {return anio;}
        public String getAutor() {return autor;}
        public String getGenero() {return genero;}
        public int getPrecio() {return precio;}
        public String getTitulo() {return titulo;}

        public void setAnio(int anio) {this.anio = anio;}
        public void setAutor(String autor) {this.autor = autor;}
        public void setGenero(String genero) {this.genero = genero;}
        public void setPrecio(int precio) {this.precio = precio;}
        public void setTitulo(String titulo) {this.titulo = titulo;}

        //metodos
        public String mostrarInfo(){ return "El libro <<"+titulo+">> fue publicado en "+anio+" por: "+autor;}
        public String MostrarPrecio(){return "El libro cuesta "+precio+" puntos"; }

}
