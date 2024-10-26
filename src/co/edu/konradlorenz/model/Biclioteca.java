package co.edu.konradlorenz.model;

import java.util.Hashtable;

public class Biclioteca {
private Hashtable<Integer, Libro> contenido;
public Biclioteca(){

}
public Biclioteca(Hashtable<Integer, Libro> contenido) {
    this.contenido = contenido;
}
 
public Libro getLibro(int id){
    return contenido.get(id);
}

public void mostrarLibros(){
    System.out.println("Libros disponibles:");
    for (Libro libro : contenido.values()) {
        System.out.println(libro.toString());
    }
}

}
