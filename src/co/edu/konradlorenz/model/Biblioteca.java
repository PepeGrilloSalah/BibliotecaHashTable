package co.edu.konradlorenz.model;

import java.util.Hashtable;

public class Biblioteca {
private Hashtable<Integer, Libro> contenido;
public Biblioteca(){

}
public Biblioteca(Hashtable<Integer, Libro> contenido) {
    this.contenido = contenido;
}
 
public Libro getLibro(int id){
    return contenido.get(id);
}

/*/ O se implementa la vista en el modelo (lo que no es recomendable), o se pone este método en el Controller
public void mostrarLibros(){
    System.out.println("Libros disponibles:");
    for (Libro libro : contenido.values()) {
        System.out.println(libro.toString());
    }
}
//*/

}
