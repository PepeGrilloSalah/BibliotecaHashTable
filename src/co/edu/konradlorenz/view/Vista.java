package co.edu.konradlorenz.view;

import java.util.Scanner;

public class Vista {
    private Scanner sc = new Scanner(System.in);
    
    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    public static void mostrarMenu() {
    System.out.println("------ Menú de Biblioteca ------");
    System.out.println("1. Agregar libros a la biblioteca");
    System.out.println("2. Prestar libro");
    System.out.println("3. Devolver libro");
    System.out.println("4. Mostrar los libros de la biblioteca");
    System.out.println("5. Eliminar un libro de la biblioteca");
    System.out.println("6. Salir");
    System.out.print("Seleccione una opción: ");
}

    public static String pedirString(String dato){
        System.out.println(dato);
    	Vista v = new Vista();
        return v.sc.nextLine();
    }
    
}
