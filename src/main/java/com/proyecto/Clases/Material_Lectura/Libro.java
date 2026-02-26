package com.proyecto.Clases.Material_Lectura;

public abstract class Libro {

        String autor;
        int anio;
        String genero;
        String titulo;
        int puntos;
        int puntoslectura = 0;

        public Libro(String titulo,String autor, String genero, int puntos, int anio){
            this.titulo = titulo;
            this.autor = autor;
            this.genero = genero;
            this.puntos = puntos;
            this.anio = anio;
        }

    //metodos
    public abstract String mostrarInfo();
    public abstract String MostrarPrecio();
    public abstract String mostrarcontenido();

    public int getAnio() {return anio;}
        public String getAutor() {return autor;}
        public String getGenero() {return genero;}
        public int getPuntos() {return puntos;}
        public String getTitulo() {return titulo;}
        public int getPuntoslectura(){return puntoslectura;}

        public void setAnio(int anio) {this.anio = anio;}
        public void setAutor(String autor) {this.autor = autor;}
        public void setGenero(String genero) {this.genero = genero;}
        public void setPuntos(int puntos) {this.puntos = puntos;}
        public void setTitulo(String titulo) {this.titulo = titulo;}

        public void sumarPuntoLectura(){this.puntoslectura++;}
        public void reinciarPuntosLectura(){this.puntoslectura=0;}

}
