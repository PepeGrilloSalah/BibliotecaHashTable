package co.edu.konradlorenz.model;

public class Libro {
     private String titulo;
     private int cantidadDeEjemplares;
     private int cantidadPrestados;
     private String ubicacion;
     
    public Libro(){
        
    }

    public Libro(String titulo, int cantidadDeEjemplares, int cantidadPrestados, String ubicacion) {
        this.titulo = titulo;
        this.cantidadDeEjemplares = cantidadDeEjemplares;
        this.cantidadPrestados = cantidadPrestados;
        this.ubicacion = ubicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCantidadDeEjemplares() {
        return cantidadDeEjemplares;
    }

    public void setCantidadDeEjemplares(int cantidadDeEjemplares) {
        this.cantidadDeEjemplares = cantidadDeEjemplares;
    }

    public int getCantidadPrestados() {
        return cantidadPrestados;
    }

    public void setCantidadPrestados(int cantidadPrestados) {
        this.cantidadPrestados = cantidadPrestados;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", cantidadDeEjemplares=" + cantidadDeEjemplares + ", cantidadPrestados="
                + cantidadPrestados + ", ubicacion=" + ubicacion + "]";
    }

    
}
